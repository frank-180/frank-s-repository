package commandPattern;

/**
 * 
 * ֪�����ʵʩ��ִ��һ����������صĲ������κ��඼������Ϊһ�������ߡ�
 * ����ִ������ĵط�
 * 
 * @author ���ں�
 *
 */

interface Reciever {
	public void action();
}

class RecieverA implements Reciever {

	@Override
	public void action() {
		// TODO Auto-generated method stub
		System.out.println("RecieverAִ������");
	}
	
}

class RecieverB implements Reciever {

	@Override
	public void action() {
		// TODO Auto-generated method stub
		System.out.println("RecieverBִ������");
	}
	
}

class RecieverC implements Reciever {

	@Override
	public void action() {
		// TODO Auto-generated method stub
		System.out.println("RecieverCִ������");
	}
	
}
