package mediatorPattern;

/**
 * 
 * �ͻ���
 * 
 * @author ���ں�
 *
 */

public class MediatorClient {

	public static void main(String[] args) {
		ConcreteMediator concreteMediator = new ConcreteMediator();

		// ����������ͬ������ʶ�н��߶���
		ConcreteColleague1 concreteColleague1 = new ConcreteColleague1(
			concreteMediator);
		ConcreteColleague2 concreteColleague2 = new ConcreteColleague2(
			concreteMediator);

		// ���н�����ʶ��������ͬ�������
		concreteMediator.setC1(concreteColleague1);
		concreteMediator.setC2(concreteColleague2);

		// ����ͬ����������Ϣ���Ͷ���ͨ���н��߶���ת��
		concreteColleague1.sendMsg("�Թ�����û�У�");
		concreteColleague2.sendMsg("û���أ��������ͣ�");

	    }
}
