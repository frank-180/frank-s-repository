package adapterPattern;

/**
 * 
 * �������࣬ͨ�����ڲ���װһ��Adaptee���󣬰�ԭ�ӿ�ת����Ŀ��ӿ�
 * 
 * @author ���ں�
 *
 */

public class Adapter extends Target {

	private Adaptee adaptee = new Adaptee();

	@Override
	public void request() {
		// TODO Auto-generated method stub
		adaptee.specifiRequest();
	}
	
}
