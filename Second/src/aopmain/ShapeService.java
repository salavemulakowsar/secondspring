package aopmain;

import aopmodel.Circle;
import aopmodel.Loggable;
import aopmodel.Triangle;

public class ShapeService {
	Circle circle;
	Triangle triangle;
	
	public Circle getCircle() {
		return circle;
	}
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	@Loggable
	public Triangle getTriangle() {
		return triangle;
	}
	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}
}
