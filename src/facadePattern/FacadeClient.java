package facadePattern;

/**
 * 
 * ��ۿͻ���
 * 
 * @author ���ں�
 *
 */

public class FacadeClient {

	public static void main(String[] args) {
		
		Facade facade = new Facade();

		facade.methodA();
		facade.methodB();
	}
}
