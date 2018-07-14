package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.pojo.JsonObjectFormat;

@Controller
@RequestMapping(value="err")
public class ErroController {

	@RequestMapping(value="/error")
	public String error() {
		int a = 1 / 0;
		return "thymeleaf/error";
	}
	
	@RequestMapping(value="/ajaxerror")
	public String ajaxerror() {
		return "thymeleaf/ajaxerrorfile";
	}
	
	@RequestMapping(value="/getAjaxerror")
	@ResponseBody
	public JsonObjectFormat getAjaxerror() {
		int a = 1 / 0;
		return JsonObjectFormat.ok();
	}
}
