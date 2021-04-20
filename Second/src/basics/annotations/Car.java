package basics.annotations;

import org.springframework.stereotype.Component;

//import org.springframework.stereotype.Component;
@Component
public class Car implements Vehicle {
	
	public void drive()
	{
		System.out.println("Car drive");
	}

}
