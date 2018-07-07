package com.example.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pojo.JsonObjectFormat;
import com.example.pojo.Resource;

@RestController
public class PropertyController {

	@Autowired
	private Resource resource;
	
	@RequestMapping(value="/property")
	public Object property() {
		return "this is a properties file resolvation controller";
	}
	
	@RequestMapping(value="/getProperties")
	public JsonObjectFormat getProperties() {
		Resource bean = new Resource();
		BeanUtils.copyProperties(resource, bean);
		return JsonObjectFormat.ok(bean);
	}
	
}
