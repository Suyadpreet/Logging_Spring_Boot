package com.suyad.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class RestControllers 
{
	@GetMapping("/welcome")
	public String getWelcomeMsg()
	{
		log.info("getWelcomeMsg() execution start....." );
		String msg = "Welcome to Ashok IT";
		log.info("getWelcomeMsg() execution end....." );
		return msg;
	}
	
	@GetMapping("/greet")
	public String getgreetMsg()
	{
		log.info("getgreetMsg() execution start....." );
		String msg = "Good Evening..";
		log.info("getgreetMsg() execution end....." );
		return msg;
	}
}
