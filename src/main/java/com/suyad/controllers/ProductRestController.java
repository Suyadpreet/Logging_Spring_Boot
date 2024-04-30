package com.suyad.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
public class ProductRestController 
{	
	Logger logger = LoggerFactory.getLogger(ProductRestController.class);
	@GetMapping("/product")
	public String getProductInfo()
	{
		logger.info("getProductInfo() method execution start");
		String msg = null;
		System.out.println(msg.length());
		logger.info("getProductInfo() method execution end");
		return "Product Not Available";
	}
	
}
