package observer;

public class ConcreteObserver extends Observer{
	private String name;
    private int state;
    private ConcreteSubject subject;

    public ConcreteObserver(ConcreteSubject subject, String name){
        this.name = name;
        this.subject = subject;
    }
    public void update() {
        state = subject.getState();
        System.out.println("观察者 "+name+" 的新状态是"+state);
    }
}
