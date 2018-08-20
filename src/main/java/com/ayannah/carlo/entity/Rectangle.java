package com.ayannah.carlo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import com.ayannah.carlo.entity.*;

@Entity
@Table(name="shapes")
public class Rectangle extends Shape{

	

	/**
	 * 
	 */
	private static final long serialVersionUID = 6363927515589962622L;
	
	@Column(name="shapeType")
	@Enumerated(EnumType.STRING)
	private ShapeType shapeType;
	
	public Rectangle(ShapeType shapeType) {
		this.shapeType = shapeType;
	}
	
	@Override
	public ShapeType getShapeType() {
		
		return this.shapeType;
	}

	@Override
	public void setShapeType(ShapeType shapeType) {
		this.shapeType = shapeType;
		
	}
	
}
