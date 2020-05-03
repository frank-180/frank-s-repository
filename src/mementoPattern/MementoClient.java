package mementoPattern;

/**
 * 
 * �ͻ���
 * 
 * @author ���ں�
 *
 */

public class MementoClient {

	 public static void main(String[] args) {
			// ���ó�ʼ״̬
		Originator originator = new Originator();
		originator.setState("On");
		originator.show();

		// ������ͨ������¼����״̬���������˺ܺõط�װ����������Originator��ʵ��ϸ��
		CareTaker careTaker = new CareTaker();
		careTaker.setMemento(originator.createMemento());

		// �ı�״̬
		originator.setState("Off");
		originator.show();

		// ͨ�������ߴӱ���¼�лָ�״̬
		originator.recoverMemento(careTaker.getMemento());
		originator.show();
		}

}
