package adapterPattern;

/**
 * 
 * 客户所期待的接口
 * 
 * @author 程期浩
 *
 */

public abstract class Target {
	
	public void request() {
		System.out.println("普通请求！");
	}
	
}
