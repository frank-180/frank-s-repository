package facadePattern;

/**
 * 
 * 外观客户类
 * 
 * @author 程期浩
 *
 */

public class FacadeClient {

	public static void main(String[] args) {
		
		Facade facade = new Facade();

		facade.methodA();
		facade.methodB();
	}
}
