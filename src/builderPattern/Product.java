package builderPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * ��Ʒ�࣬�ɶ���������
 * 
 * @author ���ں�
 *
 */

public class Product {

	List<String> parts = new ArrayList<String>();
	
	//��Ӳ�Ʒ����
	public void add(String part) {
		parts.add(part);
	}
	
	//�о����еĲ�Ʒ����
	public void show() {
		System.out.println("---��Ʒ ����---");
		
		for (String part : parts) {
			System.out.println(part);
		}
	}
}
