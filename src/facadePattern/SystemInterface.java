package facadePattern;

/**
 * 
 * @author ���ں�
 *
 */
public interface SystemInterface {

}

class SubSystemOne implements SystemInterface {
    public void methodOne() {
	System.out.println("��ϵͳ����һ");
    }
}

class SubSystemTwo implements SystemInterface {
    public void methodTwo() {
	System.out.println("��ϵͳ������");
    }
}

class SubSystemThree implements SystemInterface {
    public void methodThree() {
	System.out.println("��ϵͳ������");
    }
}

class SubSystemFour implements SystemInterface {
    public void methodFour() {
	System.out.println("��ϵͳ������");
    }
}
