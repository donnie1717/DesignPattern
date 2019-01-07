package proxy;

public class ProxyGiven implements GifGift{
	
	private Pursuit p;
	
	public ProxyGiven(Girl girl) {
		p = new Pursuit(girl);
		
	}
	@Override
	public void give() {
		p.name = "jack";
		p.give();
	}

}
