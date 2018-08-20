package group.artifact;


import org.junit.Test;



@Deprecated
public class ShapeTest {

	@Test
	public void test() {
		
		System.out.println("test start");
		
		/**
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("shapes.xml"));
		
		
		BeanFactory beanFactory = new ClassPathXmlApplicationContext(new String[] {
				"shapes.xml"
			});
		
		Triangle triangle = (Triangle)beanFactory.getBean("triangle");
		triangle.setLength(2);
		triangle.setWidth(10);
		String type = String.valueOf(triangle.getShapeTypimport org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;e());
			
		
		ShapeService s = (ShapeService)beanFactory.getBean("shapeService");
		s.computeArea(type, triangle.getLength(), triangle.getWidth());
		*/
	}
	
//	@Test
//	public void test2() throws SQLException {
//	
//		ShapeDB s = new ShapeDB();
//		s.delete(3);
//	}

}
