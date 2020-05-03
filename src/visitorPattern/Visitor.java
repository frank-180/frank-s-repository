package visitorPattern;

/**
 * 
 * Ϊ�ö���ṹ��ConcreteElement��ÿһ��������һ��Visit����
 * 
 * @author ���ں�
 *
 */

public abstract class Visitor {

	public abstract void visitConcreteElementA(ConcreteElementA concreteElementA);

    public abstract void visitConcreteElementB(ConcreteElementB concreteElementB);

}

class ConcreteVisitor1 extends Visitor {

    @Override
    public void visitConcreteElementA(ConcreteElementA concreteElementA) {
    	System.out.println(concreteElementA.getClass().getSimpleName() + "��"
    			+ this.getClass().getSimpleName() + "����");
    }

    @Override
    public void visitConcreteElementB(ConcreteElementB concreteElementB) {
    	System.out.println(concreteElementB.getClass().getSimpleName() + "��"
    			+ this.getClass().getSimpleName() + "����");
    }

}

class ConcreteVisitor2 extends Visitor {

    @Override
    public void visitConcreteElementA(ConcreteElementA concreteElementA) {
    	System.out.println(concreteElementA.getClass().getSimpleName() + "��"
    			+ this.getClass().getSimpleName() + "����");
    }

    @Override
    public void visitConcreteElementB(ConcreteElementB concreteElementB) {
    	System.out.println(concreteElementB.getClass().getSimpleName() + "��"
    			+ this.getClass().getSimpleName() + "����");
    }

}