package interatorPattern;

/**
 * 
 * 聚集接口
 * 
 * @author 程期浩
 * 
 * @param <T>
 *
 */

public interface Aggregate<T> {

	public Iterator<T> createIterator();
}
