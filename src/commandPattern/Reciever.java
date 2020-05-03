package commandPattern;

/**
 * 
 * 知道如何实施与执行一个与请求相关的操作，任何类都可能作为一个接受者。
 * 真正执行请求的地方
 * 
 * @author 程期浩
 *
 */

interface Reciever {
	public void action();
}

class RecieverA implements Reciever {

	@Override
	public void action() {
		// TODO Auto-generated method stub
		System.out.println("RecieverA执行请求！");
	}
	
}

class RecieverB implements Reciever {

	@Override
	public void action() {
		// TODO Auto-generated method stub
		System.out.println("RecieverB执行请求！");
	}
	
}

class RecieverC implements Reciever {

	@Override
	public void action() {
		// TODO Auto-generated method stub
		System.out.println("RecieverC执行请求！");
	}
	
}
