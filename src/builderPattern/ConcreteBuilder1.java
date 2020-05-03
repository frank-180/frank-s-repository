package builderPattern;

/**
 * 
 * 具体建造类1
 * 
 * @author 程期浩
 *
 */

public class ConcreteBuilder1 extends Builder {

	private Product product = new Product();
	
	@Override
	public void buildPartA() {
		// TODO Auto-generated method stub
		product.add("部件A");
	}

	@Override
	public void buildPartB() {
		// TODO Auto-generated method stub
		product.add("部件B");
	}

	@Override
	public Product getBuildResult() {
		// TODO Auto-generated method stub
		return product;
	}

}
