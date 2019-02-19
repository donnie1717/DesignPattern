package observer;

public class ConcreteSubject extends Subject{
	private int state;
    public void setState(int state){
        this.state = state;
        super.notifyObserver();
    }
    public int getState(){
        return state;
    }
}
