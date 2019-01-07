package singleton;

public class HunSingleton {
	
	private HunSingleton() {}
	
	private static HunSingleton singleton = new HunSingleton();
	
	public static HunSingleton getSingleton(){
		return singleton;
	}
}
