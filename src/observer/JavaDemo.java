package observer;

public class JavaDemo {
	
	public static void main(String[] args){
        ConcreteSubject s = new ConcreteSubject();
        s.Attach(new ConcreteObserver(s, "X"));
        s.Attach(new ConcreteObserver(s, "Y"));
        s.Attach(new ConcreteObserver(s, "Z"));
        //更改状态
        s.setState(2);
        s.setState(3);
    }
}
