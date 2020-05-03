package compositePattern;


/**
 * 
 * 叶子(Leaf)构件角色
 * 
 * @author 程期浩
 *
 */

public class Leaf implements Component {

	private String name;

    public Leaf(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.println(getName());
    }


}
