package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="err")
public class ErroController {

	@RequestMapping(value="error")
	public String error() {
		int a = 1 / 0;
		return "thymeleaf/error";
	}
}
