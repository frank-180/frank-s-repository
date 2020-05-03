package simpleFactoryPattern;

/**
 * 
 * 加法类
 * 
 * @author 程期浩
 *
 */
public class OperationAdd extends Operation{

	@Override
	public double result() {
		// TODO Auto-generated method stub
		return numberA + numberB;
	}

}
