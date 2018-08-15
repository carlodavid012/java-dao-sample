package services;

import entity.ShapeType;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import dao.ShapeDB;
import entity.MyShape;
import entity.Shape;

public class ShapeService implements MyShape{
	

	@Override
	public void computeArea(String shapeType, int length, int width) {
		
		int area = length * width;
		
		ShapeDB shapeDB = new ShapeDB();
		
		try {
			shapeDB.insertData(length, width, shapeType, area);
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
}
