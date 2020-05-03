package interatorPattern;

/**
 * 
 * �������ӿ�
 * 
 * @author ���ں�
 *
 */

public interface Iterator<T> {

	public T first();
	
	public T next();
	
	public boolean isDone();
	
	public T currentItem();
	
}
