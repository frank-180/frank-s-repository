package builderPattern;

/**
 * 
 * 抽象建造类
 * 
 * @author 程期浩
 *
 */

public abstract class Builder {

	public abstract void buildPartA();
	
	public abstract void buildPartB();
	
	public abstract Product getBuildResult();
	
}
