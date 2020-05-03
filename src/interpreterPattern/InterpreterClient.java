package interpreterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * ������ʾ���ķ�������һ���ض��ľ��ӵĳ����﷨�������ý��Ͳ���
 * 
 * @author ���ں�
 *
 */

public class InterpreterClient {

	public static void main(String[] args) {
		Context context = new Context();
		List<AbstractExpression> list = new ArrayList<AbstractExpression>();

		list.add(new TerminalExpression());
		list.add(new NonTerminalExpression());
		list.add(new TerminalExpression());
		list.add(new TerminalExpression());

		for (AbstractExpression expression : list) {
		    expression.interpret(context);
		}

	    }
}
