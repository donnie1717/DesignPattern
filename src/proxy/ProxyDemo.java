package proxy;

public class ProxyDemo {
	public static void main(String[] args) {
		ProxyGiven pg = new ProxyGiven(new Girl("rose"));
		pg.give();
	}
}
