package commandPattern;

import java.util.List;

/**
 * 
 * ��������ִ�в����Ľӿ�
 * 
 * @author ���ں�
 *
 */

public abstract class Command {

	protected List<Reciever> recievers;
	
	public Command(List<Reciever> recievers) {
		this.recievers = recievers;
	}
	
	public void addRecievers(Reciever reciever) {
		this.recievers.add(reciever);
	}
	
	public abstract void execute();
	
}

//��һ�������߶������һ�����������ý�������Ӧ�Ĳ�������ʵ��excute
class ConcreteCommand extends Command {

	public ConcreteCommand(List<Reciever> recievers) {
		super(recievers);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		for (Reciever reciever : recievers) {
			reciever.action();
		}
	}
	
}
