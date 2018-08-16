package services;

import java.sql.SQLException;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import dao.ShapeDB;
import entity.MyShape;

public class ShapeService implements MyShape{
	

	public void computeArea(String shapeType, int length, int width) {
		
		int area = length * width;
		
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("shapes.xml"));
		ShapeDB shapedb = (ShapeDB)factory.getBean("shapedb");
		
		try {
			shapedb.insertData(length, width, shapeType, area);
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
}
