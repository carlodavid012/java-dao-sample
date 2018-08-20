package com.ayannah.carlo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@Table(name="shapes")
public class Square extends Shape{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3860962899895656981L;
	
	@Column(name="shapeType")
	@Enumerated(EnumType.STRING)
	private ShapeType shapeType;
	
	public Square() {}
	
	public Square (ShapeType shapeType) {
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
