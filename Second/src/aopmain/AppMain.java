package aopmain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("aspect1.xml");
	ShapeService shapeService = context.getBean("shapeService",ShapeService.class);
	System.out.println(shapeService.getTriangle().getName());
	//System.out.println(shapeService.getTriangle().setName("isoceless"));
	//System.out.println(shapeService.getCircle().getDia());
   // shapeService.getCircle().setName("incircle");
}
}
