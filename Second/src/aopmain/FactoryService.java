package aopmain;

import aopmodel.Circle;
import aopmodel.Triangle;

public class FactoryService {
public Object getBean(String beanType)
{
	Object bean = null;
	if(beanType.equals("shapeService"))
		return new ShapeServiceProxy();
	if(beanType.equals("Circle"))
		return new Circle();
	if(beanType.equals("Triangle"))
		return new Triangle();
	return null;
}
}
