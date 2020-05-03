package bridgePattern;

/**
 * 
 * @author 程期浩
 *
 */

public abstract class Abstraction {
	protected Implementor implementor;//桥接模式的关键，使得Abstraction聚合Implementor
	private String name;
	
	public Abstraction(String name) {
		this.setName(name);
	}

	public void setImplementor(Implementor implementor) {
		this.implementor = implementor;
	}
	
	public void operation() {
		System.out.println("Abstraction-" + this.getName() + ": ");
	}
	
	private String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	private void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}
	
	
}

class AbstractionA extends Abstraction {
		
	public AbstractionA(String name) {
		super(name);
	}
	
	@Override
	public void operation() {
		super.operation();
	}
}

class AbstractionB extends Abstraction {
	
	public AbstractionB(String name) {
		super(name);
	}
	
	@Override
	public void operation() {
		super.operation();
	}
}

