package interatorPattern;

/**
 * 
 * �ۼ��ӿ�
 * 
 * @author ���ں�
 * 
 * @param <T>
 *
 */

public interface Aggregate<T> {

	public Iterator<T> createIterator();
}
