package entity;

public abstract class Shape {
	
	private int length;
	private int width;
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
