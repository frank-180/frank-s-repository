package templatePattern;

/**
 * 
 * ģ�巽�������ࣺ����Ĳ��ָ�������ʵ�֣��仯�Ĳ��ַ�װΪ���󷽷��ӳٵ�����ʵ��
 * 
 * @author ���ں�
 *
 */

public abstract class AbstractTemplate {

	public abstract void primitiveOperation1();

    public abstract void primitiveOperation2();

    public void templateMethod() {
    	primitiveOperation1();
    	primitiveOperation2();
		System.out.println("ģ�巽������\n");
    }
}
