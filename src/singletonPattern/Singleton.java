package singletonPattern;

/**
 * 
 * 单例类，使用饿汉式
 * 
 * @author 程期浩
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
