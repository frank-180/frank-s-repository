package first;

public class ������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        double a = 0, b = 1;          //������������a����������b����ֵ
        int n = 100000;               //����������n����ֵ
        double sum = 0;	              //�������ֳ�ʼֵsum����ֵ
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
