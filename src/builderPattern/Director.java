package builderPattern;

/**
 * 
 * ָ�����࣬����ָ�ӽ������
 * 
 * @author ���ں�
 *
 */

public class Director {

	public void construct(Builder builder) {
		builder.buildPartA();
		builder.buildPartB();
	}
}
