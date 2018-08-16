package group.artifact;


import java.sql.SQLException;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import dao.ShapeDB;
import entity.Square;
import entity.Triangle;
import services.ShapeService;

public class ShapeTest {

	@Test
	public void test() throws SQLException {
		
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("shapes.xml"));
		
		Square square = (Square)factory.getBean("square");
		square.setLength(10);
		square.setWidth(10);
		String type = String.valueOf(square.getShapeType());
			
		
		ShapeService s = (ShapeService)factory.getBean("shapeService");
		s.computeArea(type, square.getLength(), square.getWidth());
		
	}
	
//	@Test
//	public void test2() throws SQLException {
//	
//		ShapeDB s = new ShapeDB();
//		s.delete(3);
//	}

}
