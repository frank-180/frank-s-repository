package decoratorPattern;

/**
 * 
 * Decorator��װ�γ����࣬�̳���Component������������չComponent��Ĺ��ܣ�������Component��˵��
 * ������֪��Decorator�Ĵ��ڵ�
 * 
 * @author ���ں�
 *
 */

public abstract class Decorator extends Component {

	protected Component component;

    public Component getComponent() {
    	return component;
    }

    public void setComponent(Component component) {
    	this.component = component;
    }

    @Override
    public void operation() {
    	if (component != null) {
    		component.operation();
    	}
    }

}

class ConcreteDecoratorA extends Decorator {
    private String addedState;

    @Override
    public void operation() {
    	// ��������ԭComponent��operation()����ִ�б���Ĺ��ܣ���addedState���൱�ڶ�ԭComponent������װ��
    	super.operation();
		addedState = "A�е�new state ";
		System.out.println(addedState + "����װ�ζ���A�Ĳ���");
    }
}

class ConcreteDecoratorB extends Decorator {
    @Override
    public void operation() {
    	super.operation();
    	addedBehavior();
    	System.out.println("����װ�ζ���B�Ĳ���");
    }

    public void addedBehavior() {
    	System.out.print("B�е�������Ϊ ");
    }
}

class ConcreteDecoratorC extends Decorator {
    @Override
    public void operation() {
    	super.operation();
    	System.out.println("Cû��������Ϊ " + "����װ�ζ���C�Ĳ���");
    }
}

