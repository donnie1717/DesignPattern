package observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
	private List<Observer> observers = new ArrayList<Observer>();
    //增加观察者
    public void Attach(Observer observer){
        observers.add(observer);
    }
    //移除观察者
    public void Detach(Observer observer){
        observers.remove(observer);
    }
    //通知
    public void notifyObserver(){
        for(Observer observer : observers){
            observer.update();
        }
    }
}
