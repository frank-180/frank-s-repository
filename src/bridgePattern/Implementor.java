package bridgePattern;

/**
 * 
 * @author 程期浩
 *
 */

public abstract class Implementor {

	public abstract void operation();
	
}

class ConcreteImplementorA extends Implementor {

	@Override
	public void operation() {
		// TODO Auto-generated method stub
		System.out.println("ConcreteImplementorA的方法执行");
	}
	
}

class ConcreteImplementorB extends Implementor {

	@Override
	public void operation() {
		// TODO Auto-generated method stub
		System.out.println("ConcreteImplementorB的方法执行");
	}
	
}
