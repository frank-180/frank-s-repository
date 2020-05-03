package commandPattern;

/**
 * 
 * 要求该命令执行这个要求
 * 
 * @author 程期浩
 *
 */

public class Invoker {
	
	private Command command;
	
	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void executeCommand() {
		command.execute();
	}
}
