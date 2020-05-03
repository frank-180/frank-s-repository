package builderPattern;

/**
 * 
 * 指挥者类，用来指挥建造过程
 * 
 * @author 程期浩
 *
 */

public class Director {

	public void construct(Builder builder) {
		builder.buildPartA();
		builder.buildPartB();
	}
}
