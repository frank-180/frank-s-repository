package proxyPattern;

/**
 * 
 * 真实实体类
 * 
 * @author 程期浩
 *
 */

public class RealSubject implements Subject{

	@Override
	public void request() {
		// TODO Auto-generated method stub
		System.out.println("真实对象的请求");
	}

	
}
