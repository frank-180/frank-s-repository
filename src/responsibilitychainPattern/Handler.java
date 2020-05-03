package responsibilitychainPattern;

/**
 * 
 * ��������Ľӿ�
 * 
 * @author ���ں�
 *
 */

public abstract class Handler {

	protected Handler successor;

    public void setSuccessor(Handler successor) {
    	this.successor = successor;
    }

    public abstract void handleRequest(int request);
}

// ���崦�����࣬����������������󣬿ɷ������ĺ���ߣ�����ɴ����������������ת�����ĺ���ߴ���
class ConcreteHandlerA extends Handler {

    @Override
    public void handleRequest(int request) {
    	if (request >= 0 && request <= 10) {
    		System.out.println(this.getClass().getName() + "����������" + request);
    	} else if (successor != null) {
    		successor.handleRequest(request);
    	}
    }

}

class ConcreteHandlerB extends Handler {

    @Override
    public void handleRequest(int request) {
    	if (request > 10 && request <= 20) {
    		System.out.println(this.getClass().getName() + "����������" + request);
    	} else if (successor != null) {
    		successor.handleRequest(request);
    	}
    }

}

class ConcreteHandlerC extends Handler {

    @Override
    public void handleRequest(int request) {
    	if (request > 20 && request <= 30) {
    		System.out.println(this.getClass().getName() + "����������" + request);
    	} else if (successor != null) {
    		successor.handleRequest(request);
    	}
    }

}