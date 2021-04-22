package aopmodel;

public class Circle {
	String name;

	/*
	 * public Circle() { System.out.println("in circle constructor"); }
	 */
	
	public String getName() {
		System.out.println("I am the circles getter method");
		return name;
		//throw new RuntimeException();
	}

	public void setName(String name) {
		System.out.println("setting name for circle");
		this.name = name;
		//throw new RuntimeException();
	}
	
	public int getDia() {
		//throw new RuntimeException();
		return 5;
	}
}
