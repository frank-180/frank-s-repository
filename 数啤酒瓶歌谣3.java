package ÊýÆ¡¾ÆÆ¿¸èÒ¥;

public class ÊýÆ¡¾ÆÆ¿¸èÒ¥3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       int a = 99, b = 0;
	        do{
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
	        }while(b < a);
	}

}
