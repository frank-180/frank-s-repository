package adapterPattern;

/**
 * 
 * 适配器客户端
 * 
 * @author 程期浩
 *
 */

public class AdapterClient {

	public static void main(String[] args) {
		Target target;
		
		target = new Adapter();
		target.request();
	}
	
}
