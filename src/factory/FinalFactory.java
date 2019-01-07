package factory;

/**
 * 传统的工厂模式   扩展性不够强  得为每一个接口的新实现类添加工厂
 * @author zhoudongqi
 *
 */
class Factory{
	private static Message message = null;
	
	public static Message getMessage(String name) {
		
		if(message == null) {
			if("angrymessage".equalsIgnoreCase(name)) {
				message = new AngryMessage();
			}else if("hellomessage".equalsIgnoreCase(name)){
				message = new HelloMessage();
			}
		}
		
		return message;
		
	}
}

class AngryMessage implements Message{
	
	public void send() {
		System.out.println("get message: I am angry!");
	}
}

class HelloMessage implements Message{

	public void send() {
		System.out.println("get message: Hello World!");
	}
	
}

interface Message{
	public void send();
}


public class FinalFactory {

	public static void main(String[] args) {
		Message message = Factory.getMessage("angrymessage");
		message.send();
	}
}
