package entity;

public class Square extends Shape{
	
	private ShapeType shapeType;
	
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
