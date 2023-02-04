package com.springboot.uploading.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@org.springframework.stereotype.Controller
public class Controller {

	@GetMapping("/example")
	public String example()
	{
		return "example";
		}
}
