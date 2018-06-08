/*    */ package com.example.myCat;
/*    */ 
/*    */ import org.springframework.boot.SpringApplication;
/*    */ import org.springframework.boot.autoconfigure.SpringBootApplication;
/*    */ import org.springframework.context.annotation.ComponentScan;
/*    */ import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
/*    */ import org.springframework.web.servlet.config.annotation.EnableWebMvc;
/*    */ 
/*    */ @org.springframework.boot.web.servlet.ServletComponentScan
/*    */ @SpringBootApplication
/*    */ @EnableWebMvc
/*    */ @ComponentScan(basePackages={"com.example.myCat"})
/*    */ @EnableJpaRepositories(basePackages={"com.example.myCat.daos"})
/*    */ @org.springframework.boot.autoconfigure.domain.EntityScan(basePackages={"com.example.myCat.entities"})
/*    */ public class MyCatApplication
/*    */ {
/*    */   public static void main(String[] args)
/*    */   {
/* 19 */     SpringApplication.run(MyCatApplication.class, args);
/*    */   }
/*    */ }


/* Location:              F:\Test_workspace\myCat\target\classes\!\com\example\myCat\MyCatApplication.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */