package ��ơ��ƿ��ҥ;

public class ��ơ��ƿ��ҥ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method s
	       int a = 99, b = 0;
	        while(b < a) {
	        	if(a > 1) {
	        		System.out.println(a + " bottles of beer on the wall." + a + " bottles of beer.");
	                System.out.println("Tske one down.");
	                System.out.println("Pass it around.");
	                if(a > 2) {
	                	System.out.println(a - 1 + " bottles of beer on the wall.");
	                }
	                else {
	                	System.out.println(a - 1 + " bottle of beer on the wall.");
	                }
	                System.out.print("\n");
	        	}
	        	else {
	        		System.out.println(a + " bottle of beer on the wall." + a + " bottle of beer.");
	        		System.out.println("Tske one down.");
	                System.out.println("Pass it around.");
	                System.out.println("No more bottles on the wall.");
	        	}
	        	a--;
	        }
	}

}
