package com.ayannah.carlo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@Table(name="shapes")
public class Triangle extends Shape{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6862097138922394256L;
	
	@Column(name="shapeType")
	@Enumerated(EnumType.STRING)
	private ShapeType shapeType;
	
	public Triangle() {}
	
	public Triangle(ShapeType shapeType) {
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
