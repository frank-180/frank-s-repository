package mementoPattern;

/**
 * 
 * 发起人类
 * 
 * @author 程期浩
 *
 */

public class Originator {

	private String state;

    public Memento createMemento() {
    	return new Memento(this.state);
    }

    public void recoverMemento(Memento memento) {
    	this.setState(memento.getState());
    }

    public void show() {
    	System.out.println("state = " + this.state);
    }

    public String getState() {
    	return state;
    }

    public void setState(String state) {
    	this.state = state;
    }
}
