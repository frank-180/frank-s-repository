package templatePattern;

/**
 * 
 * 模板方法客户端
 * 
 * @author 程期浩
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
