package Assignment1;
import java.util.*;
import java.util.Map;
public class ArrayList {

	public static void main(String[] args) {
	Map<Integer,String> hm = new HashMap<Integer,String>();
	hm.put(33,"Z");
	hm.put(99,"I");
	hm.put(22,"A");
	hm.put(55,"B");
	hm.put(88,"X");
	hm.put(44,"M");
	
	hm.forEach((k,v) -> System.out.println(k+" "+v));
	
	/*
	 * for(Map.Entry<Integer,String> m : hm.entrySet()){
	 * System.out.println(m.getKey()+" "+m.getValue()); }
	 */
	//Map<Integer,String> hm2 = new TreeMap();
	
	Map<Integer, String> h=new java.util.TreeMap<Integer, String>(hm);
	 System.out.println(h);    

	}
	
}
