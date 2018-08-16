package entity;

public class Triangle extends Shape{
	
	private ShapeType shapeType;
	
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
