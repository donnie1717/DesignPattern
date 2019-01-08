package abstractFactory;

public class ShapeFactory extends AbstractFactory{
	
	public Shape getShape(String shape) {
		
		if("circle".equals(shape)) 
			return new Circle();
		
		if("square".equals(shape)) 
			return new Square();
		
		
		return null;
	}

	@Override
	public Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
