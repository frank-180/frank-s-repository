package strategyPattern;

/**
 * 
 * ���Խӿ�
 * 
 * @author ���ں�
 *
 */

public interface Strategy {

	public void algorithmInterface();
}

class ConcreteStrategyA implements Strategy {

    @Override
    public void algorithmInterface() {
    	System.out.println("����A�ľ����㷨ʵ��");
    }

}

class ConcreteStrategyB implements Strategy {

    @Override
    public void algorithmInterface() {
    	System.out.println("����B�ľ����㷨ʵ��");
    }

}

class ConcreteStrategyC implements Strategy {

    @Override
    public void algorithmInterface() {
    	System.out.println("����C�ľ����㷨ʵ��");
    }

}

