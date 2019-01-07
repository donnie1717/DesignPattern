package simpleFactory;

public class JavaDemo {
	
	public static void main(String[] args) {
		
		Shape shape = ShapeFactory.getShape("circle");
		shape.draw();
		
	}
	
}
