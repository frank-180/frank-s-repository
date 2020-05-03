package flyweightPattern;

import java.util.HashMap;

/**
 * 
 * ��Ԫ����
 * 
 * @author ���ں�
 *
 */

public class FlyWeightFactory {

	private HashMap<String, FlyWeight> flyWeights = new HashMap<String, FlyWeight>();
	
	public FlyWeight getFlyWeight(String key) {
		if (!flyWeights.containsKey(key)) {
		    flyWeights.put(key, new ConcreteFlyWeight());
		}

		return flyWeights.get(key);
	}
}
