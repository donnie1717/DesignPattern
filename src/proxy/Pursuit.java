package proxy;

public class Pursuit implements GifGift{
	
	public String name;
	private Girl girl;
	public Pursuit() {}
	public Pursuit(Girl girl) {
		this.girl = girl;
	}
	
	public void give() {
		System.out.println(name+"送礼物"+girl.name);
	}

}
