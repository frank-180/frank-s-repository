package builderPattern;

/**
 * 
 * ���彨����1
 * 
 * @author ���ں�
 *
 */

public class ConcreteBuilder1 extends Builder {

	private Product product = new Product();
	
	@Override
	public void buildPartA() {
		// TODO Auto-generated method stub
		product.add("����A");
	}

	@Override
	public void buildPartB() {
		// TODO Auto-generated method stub
		product.add("����B");
	}

	@Override
	public Product getBuildResult() {
		// TODO Auto-generated method stub
		return product;
	}

}
