package responsibilitychainPattern;

/**
 * 
 * �����ϵľ��崦���߶����ύ����
 * 
 * @author ���ں�
 *
 */

public class Client {

	 public static void main(String[] args) {

		Handler handlerA = new ConcreteHandlerA();
		Handler handlerB = new ConcreteHandlerB();
		Handler handlerC = new ConcreteHandlerC();

		handlerA.setSuccessor(handlerB);
		handlerB.setSuccessor(handlerC);

		int[] requests = { 2, 14, 5, 6, 8, 23, 12, 21 };

		for (int i : requests) {
			handlerA.handleRequest(i);
	    }
    }
	 
}
