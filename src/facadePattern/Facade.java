package facadePattern;

/**
 * 
 * ����࣬����Ҫ�˽����е���ϵͳ�ķ��������ԣ�������ϣ��Ա�������
 * 
 * @author ���ں�
 *
 */

public class Facade {

	 SubSystemOne subSystemOne;
	 SubSystemTwo subSystemTwo;
	 SubSystemThree subSystemThree;
	 SubSystemFour subSystemFour;

	 public Facade() {
		subSystemOne = new SubSystemOne();
		subSystemTwo = new SubSystemTwo();
		subSystemThree = new SubSystemThree();
		subSystemFour = new SubSystemFour();
	 }

	 public void methodA() {
		System.out.println("������A:");

		subSystemOne.methodOne();
		subSystemTwo.methodTwo();
		subSystemFour.methodFour();
	 }

	 public void methodB() {
		System.out.println("������B:");

		subSystemThree.methodThree();
		subSystemFour.methodFour();
	 }
}
