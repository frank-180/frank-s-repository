package templatePattern;

/**
 * 
 * ģ�巽���ͻ���
 * 
 * @author ���ں�
 *
 */

public class TemplateClient {

	public static void main(String[] args) {
		AbstractTemplate abstractTemplate;

		abstractTemplate = new ConcreteClassA();
		abstractTemplate.templateMethod();

		abstractTemplate = new ConcreteClassB();
		abstractTemplate.templateMethod();

	}
}
