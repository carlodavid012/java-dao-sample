package entity;

public class Square extends Shape{
	
	private ShapeType shapeType;
	
	public Square () {
		setShapeType(ShapeType.SQUARE);
	}

	@Override
	public ShapeType getShapeType() {
		return this.shapeType;
	}

	@Override
	public void setShapeType(ShapeType shapeType) {
		
		this.shapeType = ShapeType.SQUARE;
	}
	
	
}
