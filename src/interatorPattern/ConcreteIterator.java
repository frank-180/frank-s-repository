package interatorPattern;

/**
 * 
 * 
 * ����������࣬����һ�־��������ʵ�ַ�ʽ��˼������������ʾ����һ�ֵ�������Ϊ�����ۼ���������Ҫ�����������ݼ��ϡ�
 * ֮����Ҫ���������;ۼ��ֿ�������Ϊ�˽���Ϊ�����ݷֿ��� �����Java��Iterator��Iterable�Ĺ�ϵ�������
 * 
 * @author ���ں�
 * @param <T>
 *
 */

public class ConcreteIterator<T> implements Iterator {

	
	private ConcreteAggregate<T> concreteAggregate;
    private int current = 0;

    public ConcreteIterator(ConcreteAggregate<T> concreteAggregate) {
    	this.setConcreteAggregate(concreteAggregate);
    }

	@Override
	public T first() {
		// TODO Auto-generated method stub
		return concreteAggregate.getItems(0);
	}

	@Override
	public T next() {
		// TODO Auto-generated method stub
		current++;

		if (current < concreteAggregate.count()) {
		    return concreteAggregate.getItems(current);
		}

		return null;
	}

	@Override
	public boolean isDone() {
		// TODO Auto-generated method stub
		return current >= concreteAggregate.count() ? true : false;
	}

	@Override
	public T currentItem() {
		// TODO Auto-generated method stub
		return concreteAggregate.getItems(current);
	}

	public ConcreteAggregate<T> getConcreteAggregate() {
		return concreteAggregate;
	}

	public void setConcreteAggregate(ConcreteAggregate<T> concreteAggregate) {
		this.concreteAggregate = concreteAggregate;
	}

	public int getCurrent() {
		return current;
	}

	public void setCurrent(int current) {
		this.current = current;
	}
}
