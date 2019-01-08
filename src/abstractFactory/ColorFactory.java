package abstractFactory;

public class ColorFactory extends AbstractFactory{
	
	public Color getColor(String color) {
		
		if("red".equals(color)) {
			return new Red();
		}
		
		if("blue".equals(color)) {
			return new Blue();
		}
		
		return null;
		
	}

	@Override
	public Shape getShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
