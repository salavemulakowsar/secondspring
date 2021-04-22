package aopmain;

import aopmodel.Circle;

public class ShapeServiceProxy extends ShapeService{
	@Override
	public Circle getCircle() {
		new LoggingAspect().myLoggingAdvice();
		return super.getCircle();
	}

}
