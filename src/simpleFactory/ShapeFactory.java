package simpleFactory;

public class ShapeFactory {
	
	public static Shape getShape(String shape) {
		
		if("circle".equals(shape)) 
			return new Circle();
		
		if("square".equals(shape)) 
			return new Square();
		
		
		return null;
	}
	
}
