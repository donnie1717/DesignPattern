package factory;

class MyFactory{
	
	@SuppressWarnings("unchecked")
	public static <T> T getMessage(String name, Class<T> clazz){		
		T instance =  null;	
		try {
			 instance = (T) Class.forName(name).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return instance;
		
	}
}

class MyAngryMessage implements MyMessage{
	
	public void send() {
		System.out.println("get message: I am angry!");
	}
}

class MyHelloMessage implements MyMessage{
	public void send() {
		System.out.println("get message: Hello World!");
	}	
}

interface MyMessage{
	public void send();
}

public class RealFinalFactory {
	public static void main(String[] args) throws Exception {
		MyMessage message = MyFactory.getMessage("factory.MyHelloMessage", MyMessage.class);
		message.send();
	}
}
