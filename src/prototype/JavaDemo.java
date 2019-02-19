package prototype;

public class JavaDemo {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Prototype p1 = new CreateProtype("1");
		Prototype p2 = p1.clone();
		System.out.println(p1 == p2);
	}
	
}
