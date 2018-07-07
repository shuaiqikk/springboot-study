package com.example.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pojo.JsonObjectFormat;
import com.example.pojo.User;

//@Controller
@RestController     //springboot中@RestController的注解方式 = springmvc中 @Controller  +  @ResponseBody的注解方式
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/getUser")
	//@ResponseBody 返回一个json对象或者字符串
	public User getUser() {
		User u = new User();
		u.setName("demo");
		u.setAge(18);
		u.setBirthday(new Date());
		u.setPassword("demo");
		
		return u;
	}
	
	
	@RequestMapping("/getUserJSON")
	//@ResponseBody
	public JsonObjectFormat getUserJSON() {
		User u = new User();
		u.setName("demostration");
		u.setAge(18);
		u.setBirthday(new Date());
		u.setPassword("demostration");
		u.setDesc("hello demostration!");
		
		return JsonObjectFormat.ok(u);
	}
	
}
