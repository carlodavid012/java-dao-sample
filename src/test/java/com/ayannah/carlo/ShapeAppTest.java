package com.ayannah.carlo;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.ayannah.carlo.entity.Shape;
import com.ayannah.carlo.entity.ShapeType;
import com.ayannah.carlo.entity.Triangle;
import com.ayannah.carlo.services.ShapeService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShapeAppTest {

	@Autowired
	ShapeService shapeService;
	
	@Test
	public void test() {
		System.out.println("test app");
		
		Triangle triangle = new Triangle(ShapeType.TRIANGLE);
		triangle.setLength(3);
		triangle.setWidth(3);
		
			
		Shape shape = shapeService.computeArea(triangle);
		assertTrue(shape instanceof Triangle);
		
		
		
	}

}
