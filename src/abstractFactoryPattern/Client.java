package abstractFactoryPattern;

import simpleFactoryPattern.Operation;

/**
 * 
 * �ͻ���
 * 
 * @author ���ں�
 *
 */

public class Client {
	public static void main(String[] args) throws InstantiationException, 
			IllegalAccessException {
		Operation operation = OperationFactory.creatOperration("*");
		
		operation.numberA = 7;
		operation.numberB = 8;
		
		System.out.println(operation.result());
	}
}
