package decorator;

public class Tshirt extends Decorator{

	public Tshirt() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void show() {
		System.out.println("T恤");
		super.show();
	}

}
