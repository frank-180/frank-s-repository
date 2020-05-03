package adapterPattern;

/**
 * 
 * 适配器类，通过在内部包装一个Adaptee对象，把原接口转换成目标接口
 * 
 * @author 程期浩
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
