package compositePattern;


/**
 * 
 * Ҷ��(Leaf)������ɫ
 * 
 * @author ���ں�
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
