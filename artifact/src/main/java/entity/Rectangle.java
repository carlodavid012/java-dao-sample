package entity;

public class Rectangle extends Shape{

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
		this.shapeType = ShapeType.RECTANGLE;
		
	}
	
}
