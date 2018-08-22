package com.ayannah.carlo.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ayannah.carlo.entity.MyShape;
import com.ayannah.carlo.entity.Shape;
import com.ayannah.carlo.repository.ShapeDAO;



@Service
@Transactional
public class ShapeService implements MyShape {
	
	
	@Autowired
	private ShapeDAO shapeDAO;
	
	
    /*
     * (non-Javadoc)
     * @see com.ayannah.carlo.entity.MyShape#computeArea(java.lang.String, int, int)
     */
	public Shape computeArea(Shape shape) {
		shape.setArea(shape.getLength() * shape.getWidth());
		
		return shapeDAO.save(shape);
	}

}
