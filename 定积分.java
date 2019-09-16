package first;

public class 定积分 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        double a = 0, b = 1;          //声明积分上限a。积分下限b并赋值
        int n = 100000;               //声明子区间n并赋值
        double sum = 0;	              //声明积分初始值sum并赋值
        double m , f , x;
        
        m = (b - a) / (2 * n);
        
        for(int i = 1; i <= n; i++) {
        	x = a + 2 * i * m;
        	f = Math.sin(x);
        	sum += f * 2 * m;
        }
        
        System.out.println(sum);
	}

}
