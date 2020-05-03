package abstractFactoryPattern;

import java.util.HashMap;
import java.util.Map;

import simpleFactoryPattern.Operation;
import simpleFactoryPattern.OperationAdd;
import simpleFactoryPattern.OperationDiv;
import simpleFactoryPattern.OperationMul;
import simpleFactoryPattern.OperationSub;

/**
 * 
 * ���÷������򵥹���ģʽ��ȥ����֧�жϵ��߼�
 * 
 * @author ���ں�
 *
 */

public class OperationFactory {
	private static Map<String, Class<?>> allOperationMaps = new HashMap<String, Class<?>>();
	
	public static void fillMap() {
		allOperationMaps.put("+", OperationAdd.class);
		allOperationMaps.put("-", OperationSub.class);
		allOperationMaps.put("*", OperationMul.class);
		allOperationMaps.put("/", OperationDiv.class);
	}
	
	@SuppressWarnings("deprecation")
	public static Operation creatOperration(String operator) 
			throws InstantiationException, IllegalAccessException {
		Operation operation;
		
		fillMap();
		Class<?> operationClass = allOperationMaps.get(operator);
		
		if (operationClass ==null) {
			throw new RuntimeException("unsupported operation");
		}
		
		operation = (Operation) operationClass.newInstance();
		
		return operation;
	}
}