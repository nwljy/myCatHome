/*    */ package com.example.myCat.controllers;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class JsonResult
/*    */   implements Serializable
/*    */ {
/*    */   public static final int SUCCESS = 0;
/*    */   public static final int ERROR = 1;
/*    */   private int state;
/*    */   private String message;
/*    */   private Object data;
/*    */   
/*    */   public JsonResult() {}
/*    */   
/*    */   public JsonResult(int state, String message, Object data)
/*    */   {
/* 21 */     this.state = state;
/* 22 */     this.message = message;
/* 23 */     this.data = data;
/*    */   }
/*    */   
/*    */   public JsonResult(String error) {
/* 27 */     this.state = 1;
/* 28 */     this.message = error;
/*    */   }

/*    */   public JsonResult(String message,Object data) {
/* 27 */     this.state = 0;
/* 28 */     this.message = message;
                   this.data = data;
/*    */   }
/*    */   
/*    */   public JsonResult(Object data) {
/* 32 */     this.state = 0;
/* 33 */     this.data = data;
/*    */   }
/*    */   
/*    */   public JsonResult(Throwable e) {
/* 37 */     this.state = 1;
/* 38 */     this.message = e.getMessage();
/*    */   }
/*    */   
/*    */   public JsonResult(int state, Throwable e) {
/* 42 */     this.state = state;
/* 43 */     this.message = e.getMessage();
/*    */   }
/*    */   
/*    */   public int getState() {
/* 47 */     return this.state;
/*    */   }
/*    */   
/*    */   public void setState(int state) {
/* 51 */     this.state = state;
/*    */   }
/*    */   
/*    */   public String getMessage() {
/* 55 */     return this.message;
/*    */   }
/*    */   
/*    */   public void setMessage(String message) {
/* 59 */     this.message = message;
/*    */   }
/*    */   
/*    */   public Object getData() {
/* 63 */     return this.data;
/*    */   }
/*    */   
/*    */   public void setData(Object data) {
/* 67 */     this.data = data;
/*    */   }
/*    */   
/*    */   public String toString()
/*    */   {
/* 72 */     return "JsonResult [state=" + this.state + ", message=" + this.message + ", data=" + this.data + "]";
/*    */   }
/*    */ }


/* Location:              F:\Test_workspace\myCat\target\classes\!\com\example\myCat\controllers\JsonResult.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */