package interpreterPattern;

/**
 * 
 * 实现与文法中的终结符相关联的解释操作，文法中每一个终结符都有一个具体终结表达式与之相对应
 * 
 * @author 程期浩
 *
 */

public class TerminalExpression extends AbstractExpression {

	@Override
	public void interpret(Context context) {
		// TODO Auto-generated method stub
		System.out.println("终端解释器");
	}

	
}
