package singletonPattern;

/**
 * 
 * ����ģʽ�ͻ���
 * 
 * @author ���ں�
 *
 */

public class SingletonClient {

	public static void main(String[] args) {

		SingletonThreadSafe instance1 = SingletonThreadSafe.getInstance();
		SingletonThreadSafe instance2 = SingletonThreadSafe.getInstance();

		if (instance1.equals(instance2)) {
		    System.out.println("ͬ����ʵ��");
		} else {
		    System.out.println("��ͬ��ʵ��");
		}

	    }
}
