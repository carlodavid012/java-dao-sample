package com.ayannah.carlo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import com.ayannah.carlo.entity.*;


@Entity
public abstract class Shape implements java.io.Serializable  {
	
	
	private static final long serialVersionUID = -732282561844528945L;
	
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id", unique = true, nullable = false)
    Long id;
	public Long getId() {
		return id;
	}
	
	@Column(name="length")
	private int length;
	
	@Column(name="width")
	private int width;
	
	@Column(name="area")
	private int area;
	
	
	
	public abstract ShapeType getShapeType();
	
	public abstract void setShapeType(ShapeType shapeType);
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	
}
