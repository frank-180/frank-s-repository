package factoryMethodPattern;

import simpleFactoryPattern.Operation;

/**
 * 
 * ���������ͻ���
 * 
 * @author ���ں�
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
