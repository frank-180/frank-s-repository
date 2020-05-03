package visitorPattern;

/**
 * 
 * ����һ��accept����������һ��������Ϊ����
 * 
 * @author ���ں�
 *
 */

public abstract class Element {

	public abstract void accept(Visitor visitor);
}

class ConcreteElementA extends Element {

    @Override
    public void accept(Visitor visitor) {
    	visitor.visitConcreteElementA(this);
    }

}

class ConcreteElementB extends Element {

    @Override
    public void accept(Visitor visitor) {
    	visitor.visitConcreteElementB(this);
    }

}
