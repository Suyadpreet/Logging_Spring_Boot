package com.suyad.controllers;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
//@Slf4j
public class ControllerClass 
{
	Logger logger = LoggerFactory.getLogger(ControllerClass.class);
	@GetMapping("/")
	public String indexPage(Model model)
	{
		logger.warn("Hello This is a warning message");
		logger.trace("This is a Trace message");
		logger.info("This is a info message");
		logger.error("This is a error message");
		model.addAttribute("msg", "Welcome to index Page");
		try
		{
			int a = 10/0;
			System.out.println(a);
		}
		catch(Exception e)
		{
			logger.error("Arithmetic Exception occured", e);
		}
		return "index";
	}
	
	
}
