package basics.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
      ApplicationContext c = new ClassPathXmlApplicationContext("spring.xml");
		Vehicle v = (Vehicle) c.getBean("car");
      v.drive();
	}

	
}
