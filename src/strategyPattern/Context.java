package strategyPattern;

/**
 * 
 * ������
 * 
 * @author ���ں�
 *
 */

public class Context {
	
	Strategy strategy;

    public Context(Strategy strategy) {
    	this.strategy = strategy;
    }

    /**
     * �����Ľӿ�
     */
    public void contextInterface() {
    	strategy.algorithmInterface();
    }
}
