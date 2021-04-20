package basics.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//import org.springframework.stereotype.Component;
@Component
public class Car implements Vehicle {
	@Autowired
	Tyre t;
	public Tyre getTyre()
	{
		return t;
	}
	public void setTyre(Tyre t)
	{
		this.t = t;
	}
	public void drive()
	{
		System.out.println("Car drive"+t);
	}

}
