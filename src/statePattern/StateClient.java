package statePattern;

/**
 * 
 * �ͻ��ˣ��������󣬲��ϸ���״̬
 * 
 * @author ���ں�
 *
 */

public class StateClient {

	 public static void main(String[] args) {

		Context context = new Context(new ConcreteStateA());

		context.request();
		context.request();
		context.request();
		context.request();
		context.request();
		}
}
