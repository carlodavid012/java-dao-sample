package entity;

public class Rectangle extends Shape{

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
