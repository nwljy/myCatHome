/*    */ package com.example.myCat;
/*    */ 
/*    */ import org.springframework.boot.builder.SpringApplicationBuilder;
/*    */ import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
/*    */ 
/*    */ public class ServletInitializer extends SpringBootServletInitializer
/*    */ {
/*    */   protected SpringApplicationBuilder configure(SpringApplicationBuilder application)
/*    */   {
/* 10 */     return application.sources(new Class[] { MyCatApplication.class });
/*    */   }
/*    */ }


/* Location:              F:\Test_workspace\myCat\target\classes\!\com\example\myCat\ServletInitializer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */