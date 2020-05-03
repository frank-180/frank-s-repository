package interatorPattern;

/**
 * 
 * 迭代器接口
 * 
 * @author 程期浩
 *
 */

public interface Iterator<T> {

	public T first();
	
	public T next();
	
	public boolean isDone();
	
	public T currentItem();
	
}
