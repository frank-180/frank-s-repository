package 四则运算;
import java.util.Scanner;
public class 四则运算 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     char b ='a';
     double k;
     double g;
     Scanner scan = new Scanner (System.in);
     while (scan.hasNext()) {
    	 String expression = scan.next();
    	 if (expression.equals("b")) {
    		 break;
    	 }
    	 int[] a = new int[4];
    	 for(int i = 0;i < 4; a[i] = 0,i++);
    	 a[0] = expression.indexOf('+');
    	 a[1] = expression.indexOf('-');
    	 a[2] = expression.indexOf('*');
    	 a[3] = expression.indexOf('/');
    	 String c = null;
    	 String d = null;
    	 for(int i = 0; i < 4 ; i++) {
    		 if(a[i] > 0) {
    			 b = expression.charAt(a[i]);
    			 c = expression.substring(0,a[i]);
    			 d = expression.substring(a[i] + 1,expression.length());
    		 }
    	 }
    	 k = Double.parseDouble(c);
    	 g = Double.parseDouble(d);
    	 switch (b) {
    	 case '*':
    		 System.out.println(k * g);
    		 break;
    	 case '+':
    		 System.out.println(k + g);
    		 break;
    	 case '-':
    		 System.out.println(k - g);
    		 break;
    	 case '/':
    		 System.out.println(k / g);
    		 break;
    	 }
    		 
     }
	}

}
