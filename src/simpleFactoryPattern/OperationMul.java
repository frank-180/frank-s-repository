package simpleFactoryPattern;

/**
 * 
 * 乘法类
 * 
 * @author 程期浩
 *
 */
public class OperationMul extends Operation{

	@Override
	public double result() {
		// TODO Auto-generated method stub
		return numberA * numberB;
	}

}
