package simpleFactoryPattern;

/**
 * 
 * ʹ�ù�����������ʵ������������
 * 
 * @author ���ں�
 *
 */
public class Calculator {
	public static void main(String[] args) {
		Operation operation;
		char operator;
		
		operator = '+';
		operation = OperationFactory.createOperation(operator);
		operation.numberA = 1.2;
		operation.numberB = 2.3;
		
		System.out.println(operation.result());
	}

}
