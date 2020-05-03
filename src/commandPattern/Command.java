package commandPattern;

import java.util.List;

/**
 * 
 * 用来声明执行操作的接口
 * 
 * @author 程期浩
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

//将一个接收者对象绑定于一个动作，调用接收者相应的操作，以实现excute
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
