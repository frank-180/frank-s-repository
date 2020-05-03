package bridgePattern;

/**
 * 
 * �Ž�ģʽ�ͻ���
 * 
 * @author ���ں�
 *
 */

public class BridgeClient {
	public static void main(String[] args) {
		
		Abstraction a = new AbstractionA("A");
		a.setImplementor(new ConcreteImplementorA());
		a.operation();
		a.setImplementor(new ConcreteImplementorB());
		a.operation();
		
		Abstraction b = new AbstractionA("B");
		b.setImplementor(new ConcreteImplementorA());
		b.operation();
		b.setImplementor(new ConcreteImplementorB());
		b.operation();
		
		//����ͨ��ʹ�á����/�ۺϸ���ԭ��
		//���������AbstractiionC ... ����ConcreteImplementorC ...
		//ֻ��Ҫ��չ�༴�ɣ�����Ҫ�޸������࣬���ϡ�����-��ա�ԭ��
	}
}
