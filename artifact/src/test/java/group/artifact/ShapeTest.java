package group.artifact;


import java.sql.SQLException;
import org.junit.Test;
import entity.Square;
import entity.Triangle;
import services.ShapeService;

public class ShapeTest {

	@Test
	public void test() throws SQLException {
		Triangle shape = new Triangle();
		shape.setLength(3);
		shape.setWidth(7);
		String type = String.valueOf(shape.getShapeType());
			
		ShapeService s = new ShapeService();
		s.computeArea(type, shape.getLength(), shape.getWidth());
	}
	
//	@Test
//	public void test2() throws SQLException {
//	
//		ShapeDB s = new ShapeDB();
//		s.delete(3);
//	}

}
