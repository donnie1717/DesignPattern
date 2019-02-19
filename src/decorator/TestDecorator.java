package decorator;

public class TestDecorator {
	//装饰者模式测试类
	public static void main(String[] args) {
		
		Person person = new Person("jack");
		
		Tshirt t = new Tshirt();
		//t.show();
		Jeans j = new Jeans();
		t.Decorator(person);
		//t.show();
		j.Decorator(t);
		j.show();
		
	}
}
