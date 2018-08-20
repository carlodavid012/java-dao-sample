package com.ayannah.carlo.controller;

import java.util.List;
import java.util.Optional;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ayannah.carlo.entity.Shape;
import com.ayannah.carlo.repository.ShapeDAO;
import com.ayannah.carlo.services.ShapeService;



@RestController
public class ShapeContoller {

	private static final Log logger = LogFactory.getLog(ShapeContoller.class);
	
	@Autowired
	private ShapeDAO shapedao;
	
	
	@RequestMapping("/test/")
	public String home() {
		logger.info("home called" );
	
		return "Carlo's ShapeContoller";
	}
	
	@RequestMapping(value = "/shape", method = RequestMethod.GET)
	@ResponseBody
	public List<Shape> retrieveAllShapes() {
		
		return (List<Shape>) shapedao.findAll();
	}
	
	@RequestMapping(value = "/shape/{id}", method = RequestMethod.GET)
	@ResponseBody
	public Shape retrieveShape(@PathVariable long id) {
		Optional<Shape> shape = shapedao.findById(id);
		return shape.get();
	}
	
	
}
