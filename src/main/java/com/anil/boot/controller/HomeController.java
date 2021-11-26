package com.anil.boot.controller;

import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	//private static Logger logger = (Logger) LoggerFactory.getLogger(HomeController.class);

	
	@GetMapping("/home")
	public String HomeMessage()
	{
		//logger.info("testing the jenkins is working or not");
		return "spring-jenkins";
	}
}