package statePattern;

/**
 * 
 * ����״̬��
 * 
 * @author ���ں�
 *
 */

public abstract class State {

	public abstract void handle(Context context);
}

class ConcreteStateA extends State {

    @Override
    public void handle(Context context) {
    	System.out.println("��������״̬A");
    	context.setState(new ConcreteStateB());
    }

}

class ConcreteStateB extends State {

    @Override
    public void handle(Context context) {
    	System.out.println("��������״̬B");
    	context.setState(new ConcreteStateC());

    }

}

class ConcreteStateC extends State {

    @Override
    public void handle(Context context) {
    	System.out.println("��������״̬C");
    	context.setState(new ConcreteStateA());

    }

}
