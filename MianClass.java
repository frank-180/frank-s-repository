package Four;

public class MianClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("���û������һ��������ʵ�����鲿��");
        Complex date1 = new Complex();
        System.out.println("���û�����ڶ���������ʵ�����鲿��");
        Complex date2 = new Complex();
        
        Complex result_add = date1.add(date2);
        Complex result_sub = date1.sub(date2);
        Complex result_mul = date1.mul(date2);
        Complex result_div = date1.div(date2);
  
        result_add.print();
        result_sub.print();
        result_mul.print();
        result_div.print();
	}

}
