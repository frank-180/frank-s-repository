package builderPattern;

/**
 * 
 * 具体的建造类2
 * @author 程期浩
 *
 */

public class ConcreteBuilder2 extends Builder {

	private Product product = new Product();

	@Override
	public void buildPartA() {
		// TODO Auto-generated method stub
		product.add("部件X");
	}

	@Override
	public void buildPartB() {
		// TODO Auto-generated method stub
		product.add("部件Y");
	}

	@Override
	public Product getBuildResult() {
		// TODO Auto-generated method stub
		return product;
	}
	
	
}
