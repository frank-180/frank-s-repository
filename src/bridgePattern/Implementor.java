package bridgePattern;

/**
 * 
 * @author ���ں�
 *
 */

public abstract class Implementor {

	public abstract void operation();
	
}

class ConcreteImplementorA extends Implementor {

	@Override
	public void operation() {
		// TODO Auto-generated method stub
		System.out.println("ConcreteImplementorA�ķ���ִ��");
	}
	
}

class ConcreteImplementorB extends Implementor {

	@Override
	public void operation() {
		// TODO Auto-generated method stub
		System.out.println("ConcreteImplementorB�ķ���ִ��");
	}
	
}
