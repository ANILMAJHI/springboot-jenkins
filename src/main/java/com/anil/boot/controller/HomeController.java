package com.anil.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	//private static Logger logger = (Logger) LoggerFactory.getLogger(HomeController.class);

	
	@GetMapping("/home")
	public String HomeMessage()
	{
		//logger.info("testing the jenkins is working or not");
<<<<<<< HEAD
		return "spring-jenkins application added newly...adfasfsafasdfsa";
=======
		return "spring-jenkins added dev, UAT, PROD...new line added";
>>>>>>> 4309fffa414bc87acccfcc46022067d358c60c58
	}
}
