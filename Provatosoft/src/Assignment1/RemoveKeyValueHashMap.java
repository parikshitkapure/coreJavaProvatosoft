package Assignment1;

import java.util.HashMap;
import java.util.Map;

public class RemoveKeyValueHashMap {

	public static void main(String[] args) {
		Map<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(33,"Z");
		hm.put(99,"I");
		hm.put(22,"A");
		hm.put(55,"B");
		hm.put(88,"X");
		hm.put(44,"M");

		hm.remove(22, "A");
		System.out.println(hm);
	}

}
