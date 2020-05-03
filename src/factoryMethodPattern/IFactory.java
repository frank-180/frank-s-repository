package factoryMethodPattern;

import simpleFactoryPattern.Operation;
import simpleFactoryPattern.OperationAdd;
import simpleFactoryPattern.OperationDiv;
import simpleFactoryPattern.OperationMul;
import simpleFactoryPattern.OperationSub;

/**
 * 
 * �����ӿ�
 * 
 * @author ���ں�
 *
 */

public interface IFactory {
	public Operation creatOperation();
}

class AddFactory implements IFactory {

	@Override
	public Operation creatOperation() {
		// TODO Auto-generated method stub
		return new OperationAdd();
	}
}

class SubFactory implements IFactory {

	@Override
	public Operation creatOperation() {
		// TODO Auto-generated method stub
		return new OperationSub();
	}
}

class MulFactory implements IFactory {

	@Override
	public Operation creatOperation() {
		// TODO Auto-generated method stub
		return new OperationMul();
	}
}

class DivFactory implements IFactory {

	@Override
	public Operation creatOperation() {
		// TODO Auto-generated method stub
		return new OperationDiv();
	}
}