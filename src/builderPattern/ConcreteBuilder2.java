package builderPattern;

/**
 * 
 * ����Ľ�����2
 * @author ���ں�
 *
 */

public class ConcreteBuilder2 extends Builder {

	private Product product = new Product();

	@Override
	public void buildPartA() {
		// TODO Auto-generated method stub
		product.add("����X");
	}

	@Override
	public void buildPartB() {
		// TODO Auto-generated method stub
		product.add("����Y");
	}

	@Override
	public Product getBuildResult() {
		// TODO Auto-generated method stub
		return product;
	}
	
	
}
