package compositePattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * 容器(Composite)构件角色：学院
 * 
 * @author 程期浩
 *
 */

public class College implements Component {

	private String name;
    /** 定义容器 */
    List<Component> components = new ArrayList<>();

    public College(String name) {
        this.name = name;
    }

    /*
        对学院进行管理
     */
    protected void add (Component  component) {
    	components.add(component);
    }

    protected void remove (Component  component) {
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
