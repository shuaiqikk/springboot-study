package com.example.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import com.example.pojo.JsonObjectFormat;

@ControllerAdvice
public class ExampleExceptionHandler {

	public static final String EXAMPLE_ERROR_VIEW = "error";
	
	@ExceptionHandler(value = Exception.class)
	public Object errorHandlerOne(HttpServletRequest req,
			HttpServletResponse respo,Exception e) throws Exception{
		e.printStackTrace();
		ModelAndView mav = new ModelAndView();
		mav.addObject("exception", e);
		mav.addObject("url", req.getRequestURL());
		return mav;
	}
	
/*	@ExceptionHandler(value = Exception.class)
	public Object errorHandler(HttpServletRequest req,
			HttpServletResponse respo,Exception e) throws Exception{
		e.printStackTrace();
		if(isAjax(req)) {
			return JsonObjectFormat.errorException(e.getMessage());
		}else {
			ModelAndView mav = new ModelAndView();
			mav.addObject("exception", e);
			mav.addObject("url", req.getRequestURI());
			mav.setViewName(EXAMPLE_ERROR_VIEW);
			return mav;
		}
	}*/
	
	/**
	 * 
	 * @param req
	 * @Description 判断是否是ajax请求
	 * @return
	 */
	public static boolean isAjax(HttpServletRequest req) {
		
		return (req.getHeader("X-Requested-With") != null
				&& "XMLHttpRequest".equals(req.getHeader("X-Requested-With").toString()));
	}
	
}
