package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.pojo.Resource;

@Controller
@RequestMapping(value="ftl")
public class FreemarkerController {
	
	@Autowired
	private Resource resource;
	
	@RequestMapping(value="/index")
	public String index(ModelMap map){
		map.addAttribute("resource", resource);
		return "freemarker/index";
	}
	
	@RequestMapping(value="center")
	public String center(){
		return "freemarker/center/center";
	}
}
