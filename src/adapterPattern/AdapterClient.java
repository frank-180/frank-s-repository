package adapterPattern;

/**
 * 
 * �������ͻ���
 * 
 * @author ���ں�
 *
 */

public class AdapterClient {

	public static void main(String[] args) {
		Target target;
		
		target = new Adapter();
		target.request();
	}
	
}
