package com.example.demo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
/**
 * 
* @ClassName: ExeptionHandler
* @module  : 模块描述
* @comment : 模块包括的子功能
* @Description: 异常处理
* @author fanqingqing 
* @date 2017年6月19日 下午4:42:54
 */
@ControllerAdvice
public class ExeptionHandler {
	
	 @ExceptionHandler(value = Exception.class)  
	    public ModelAndView defaultErrorHandler(HttpServletRequest req, Exception e) {  
	        ModelAndView mv = new ModelAndView();  
	        mv.addObject("e", e);  
	        mv.addObject("uri", req.getRequestURI());  
	        return mv;  
	    }  
}
