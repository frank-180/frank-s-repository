package proxyPattern;

/**
 * 
 * ������
 * 
 * @author ���ں�
 *
 */

public class Proxy implements Subject{

	Subject subject;

    public Proxy() {
    	subject = new RealSubject();
    }
	
	@Override
	public void request() {
		// TODO Auto-generated method stub
		subject.request();
	}

	
}
