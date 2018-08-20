package com.ayannah.carlo.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ShapeContoller {

	private static final Log logger = LogFactory.getLog(ShapeContoller.class);
	
	
	@RequestMapping("/")
	public String home() {
		logger.info("home called" );
	
		return "Carlo's ShapeContoller";
	}
	
}
