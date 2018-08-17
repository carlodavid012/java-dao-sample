package services;

import java.sql.SQLException;



import dao.ShapeDAO;
import entity.MyShape;

public class ShapeService implements MyShape {
	
	private ShapeDAO shapeDAO;
	

	public void computeArea(String shapeType, int length, int width) {
		
		int area = length * width;
		
		try {
			getShapeDAO().insertData(length, width, shapeType, area);
		} catch (SQLException e) {
			System.out.println(e);
		}
	}


	public ShapeDAO getShapeDAO() {
		return shapeDAO;
	}


	public void setShapeDAO(ShapeDAO shapeDAO) {
		this.shapeDAO = shapeDAO;
	}
	
	
	
	
}
