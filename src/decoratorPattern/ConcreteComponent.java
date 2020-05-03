package decoratorPattern;

/**
 * 
 * ConcreteComponent是定义一个具体的对象，也可以给这个对象添加一些职责
 * @author 程期浩
 *
 */

public class ConcreteComponent extends Component {

	@Override
	public void operation() {
		// TODO Auto-generated method stub
		System.out.println("具体对象的操作");
	}

	
}
