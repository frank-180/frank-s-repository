package commandPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * ����һ��������������趨���Ľ�����
 * 
 * @author ���ں�
 *
 */

public class CommandClient {

	public static void main(String[] args) {
		List<Reciever> recievers = new ArrayList<Reciever>();
		
		recievers.add(new RecieverA());
		recievers.add(new RecieverB());
		recievers.add(new RecieverC());
		
		Command command = new ConcreteCommand(recievers);
		Invoker invoker = new Invoker();
		
		invoker.setCommand(command);
		invoker.executeCommand();
	}
}
