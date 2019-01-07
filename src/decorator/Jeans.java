package decorator;

public class Jeans extends Decorator{
	
	public Jeans() {
	}
	@Override
	public void show() {
		System.out.println("牛仔裤");
		super.show();
	}
}
