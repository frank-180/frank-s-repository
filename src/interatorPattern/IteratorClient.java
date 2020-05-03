package interatorPattern;

/**
 * 
 * �������ͻ���
 * 
 * @author ���ں�
 *
 */

public class IteratorClient {

	public static void main(String[] args) {
		ConcreteAggregate<String> bus = new ConcreteAggregate<String>();

		bus.setItems("����");
		bus.setItems("С��");
		bus.setItems("����");
		bus.setItems("����");
		bus.setItems("�����ڲ�Ա��");
		bus.setItems("С͵");

		Iterator<String> iterator = new ConcreteIterator<String>(bus);

		while (!iterator.isDone()) {
		    System.out.println(iterator.currentItem() + "����Ʊ��");
		    iterator.next();
		}
	}
}
