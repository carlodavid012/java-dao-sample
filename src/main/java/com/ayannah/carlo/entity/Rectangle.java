package com.ayannah.carlo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

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
	
	public ShapeType getShapeType() {
		
		return this.shapeType;
	}

	public void setShapeType(ShapeType shapeType) {
		this.shapeType = shapeType;
		
	}
	
}
