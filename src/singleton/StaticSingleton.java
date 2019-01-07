package singleton;

public class StaticSingleton {
	
	private StaticSingleton() {}
	
	private static class SingletonHolder {
        private static final StaticSingleton INSTANCE = new StaticSingleton();
    }
	
	public static StaticSingleton getUniqueInstance() {
        return SingletonHolder.INSTANCE;
    }
	
	
}
