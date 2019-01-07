package singleton;

public class LazySingleton {
	
	private LazySingleton() {}
	
	private static volatile LazySingleton lazySingleton;
	
	public static LazySingleton getSingleton() {
		
		if(lazySingleton == null) {
			synchronized (LazySingleton.class) {
				if(lazySingleton == null) {
					lazySingleton = new LazySingleton();
				}
			}
		}
		return lazySingleton;
	}
}
