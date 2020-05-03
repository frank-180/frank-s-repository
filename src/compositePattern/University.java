package compositePattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * ����(Composite)������ɫ��ѧУ
 * 
 * @author ���ں�
 *
 */

public class University implements Component{

	private String name;
    /** �������� */
    List<Component> components = new ArrayList<>();

    public University (String name ) {
        this.name = name;
    }

    /*
        ��ѧԺ���й���
     */
    protected void add (Component component) {
    	components.add(component);
    }

    protected void remove (Component component) {
    	components.remove(component);
    }

    public String getName () {
        return name;
    }

    @Override
    public void print () {
        System.out.println("--------------" + getName() + "--------------");
        for (Component component : components) {
        	component.print();
        }
    }


}
