package entity;

public class Rectangle extends Shape{

	private ShapeType shapeType;
	
	public Rectangle() {
		setShapeType(ShapeType.RECTANGLE);
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
