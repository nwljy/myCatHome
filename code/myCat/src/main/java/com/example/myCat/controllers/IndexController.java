 package com.example.myCat.controllers;
 
 import com.example.myCat.entities.EUser;
 import com.example.myCat.services.UserService;
import com.example.myCat.vos.EUserVo;

import java.util.List;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpSession;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Controller;
 import org.springframework.web.bind.annotation.RequestBody;
 import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
 
 
 
 
 @Controller
 @RequestMapping({"/"})
 public class IndexController
 {
   @Autowired
   UserService userService;
   
	@RequestMapping(value = { "checkLogin.do" }, method = { org.springframework.web.bind.annotation.RequestMethod.POST,
			org.springframework.web.bind.annotation.RequestMethod.GET })
	@ResponseBody
	public JsonResult checkLogin(HttpServletRequest req, @RequestParam(name="name",required = true) String name,@RequestParam(name="pass",required = true) String pass) {
		JsonResult jr = new JsonResult();
		try {
			EUser user=new EUser();
			user.setName(name);
			user.setPass(pass);
			List<EUser> users = this.userService.query(user);
			if (users.size() == 0) {
				jr = new JsonResult("查无此用户");
			} else if (users.size() == 1) {
				EUser eUser=users.get(0);
				EUserVo eUserVo=new EUserVo();
				BeanUtils.copyProperties(eUser, eUserVo);
				req.getSession().setAttribute("user",eUserVo );
				jr = new JsonResult("用户信息检验正确",eUserVo);
			}
		} catch (Exception e) {
			jr = new JsonResult(e);
		}

		return jr;
	}
   
 
   @RequestMapping(value={"index.do"}, method={org.springframework.web.bind.annotation.RequestMethod.POST, org.springframework.web.bind.annotation.RequestMethod.GET})
   
   public String index(HttpServletRequest req)
   {
     if (req.getSession().getAttribute("user") != null)
     {
      return "index";
     }
     
 
   return "redirect:/login.do";
   }
   
 
 
 
 
   @RequestMapping(value={"login.do"}, method={org.springframework.web.bind.annotation.RequestMethod.POST, org.springframework.web.bind.annotation.RequestMethod.GET})
 
   public String login(HttpServletRequest req)
   {
   return "login";
   }
 }

