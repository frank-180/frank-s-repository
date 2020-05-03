package flyweightPattern;

/**
 * 
 * ���о�����Ԫ��ĳ��࣬���ܲ��������ⲿ״̬
 * @author ���ں�
 *
 */

public abstract class FlyWeight {

	public abstract void operation(int extrinsicState);
}

class ConcreteFlyWeight extends FlyWeight {

    @Override
    public void operation(int extrinsicState) {
    	System.out.println("����FlyWeight��" + extrinsicState);
    }

}

class UnsharedConcreteFlyWeight extends FlyWeight {

    @Override
    public void operation(int extrinsicState) {
    	System.out.println("������ľ���FlyWeight��" + extrinsicState);
    }

}
