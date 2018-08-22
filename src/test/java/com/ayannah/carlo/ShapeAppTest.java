package com.ayannah.carlo;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.ayannah.carlo.entity.Rectangle;
import com.ayannah.carlo.entity.Shape;
import com.ayannah.carlo.entity.ShapeType;
import com.ayannah.carlo.entity.Square;
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
		
		Square square = new Square(ShapeType.SQUARE);
		square.setLength(5);
		square.setWidth(4);
		
			
		Shape shape = shapeService.computeArea(square);
		assertTrue(shape instanceof Square);
		
		
		
	}

}
