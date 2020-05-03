package singletonPattern;

/**
 * 
 * �����࣬ʹ�ö���ʽ
 * 
 * @author ���ں�
 *
 */

public class Singleton {

	 private static final Singleton instance = new Singleton();

	    private Singleton() {
	    }

	    public static Singleton getInstance() {		
	    	return instance;
	    }

}
