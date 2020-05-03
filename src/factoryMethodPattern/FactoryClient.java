package factoryMethodPattern;

import simpleFactoryPattern.Operation;

/**
 * 
 * 工厂方法客户端
 * 
 * @author 程期浩
 *
 */

public class FactoryClient {
	public static void main(String[] args) {
		IFactory operFactory = new AddFactory();
		Operation operation = operFactory.creatOperation();
		
		operation.numberA = 3.4;
		operation.numberB = 4.5;
		
		System.out.println(operation.result());
	}
}
