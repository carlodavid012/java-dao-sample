package com.ayannah.carlo.controller;

import java.util.Arrays;
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

import com.ayannah.carlo.entity.Rectangle;
import com.ayannah.carlo.entity.Shape;
import com.ayannah.carlo.entity.ShapeType;
import com.ayannah.carlo.repository.ShapeDAO;
import com.ayannah.carlo.services.ShapeService;



@RestController
public class ShapeController {

	private static final Log logger = LogFactory.getLog(ShapeController.class);
	
	@Autowired
	private ShapeDAO shapedao;

	
	@RequestMapping("/test/")
	public String home() {
		logger.info("home called" );
	
		return "Carlo's ShapeController";
	}
	
	@GetMapping(value = "/shape/all")
	public List<Shape> retrieveAllShapes() {
		
		return (List<Shape>) shapedao.findAll();
	}
	
	@GetMapping(value = "/shape/id/{id}")
	public Optional<Shape> retrieveShape(@PathVariable long id) {
		
		return shapedao.findById(id);
	}
	
	@GetMapping(value = "/shape/{shapeType}")
	public List<Shape> retrieveShape(@PathVariable String shapeType) {
		
		return shapedao.findByShape(shapeType.toUpperCase());
	}
	
}
