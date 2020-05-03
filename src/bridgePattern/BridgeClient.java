package bridgePattern;

/**
 * 
 * 桥接模式客户端
 * 
 * @author 程期浩
 *
 */

public class BridgeClient {
	public static void main(String[] args) {
		
		Abstraction a = new AbstractionA("A");
		a.setImplementor(new ConcreteImplementorA());
		a.operation();
		a.setImplementor(new ConcreteImplementorB());
		a.operation();
		
		Abstraction b = new AbstractionA("B");
		b.setImplementor(new ConcreteImplementorA());
		b.operation();
		b.setImplementor(new ConcreteImplementorB());
		b.operation();
		
		//这样通过使用“组合/聚合复用原则”
		//如果继续由AbstractiionC ... 或者ConcreteImplementorC ...
		//只需要扩展类即可，不需要修改现有类，符合“开放-封闭”原则
	}
}
