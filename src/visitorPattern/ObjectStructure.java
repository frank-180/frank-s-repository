package visitorPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * �ṩһ���߲�Ľӿ�����������߷�������Ԫ��
 * 
 * @author ���ں�
 *
 */

public class ObjectStructure {

	private List<Element> elements = new ArrayList<Element>();

    public void attach(Element element) {
    	elements.add(element);
    }

    public void detach(Element element) {
    	elements.remove(element);
    }

    public void accept(Visitor visitor) {
    	for (Element element : elements) {
    		element.accept(visitor);
    	}
    }
}
