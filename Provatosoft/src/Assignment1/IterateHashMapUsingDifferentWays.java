package Assignment1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IterateHashMapUsingDifferentWays {

	public static void main(String[] args) {

		Map<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(33,"Z");
		hm.put(99,"I");
		hm.put(22,"A");
		hm.put(55,"B");
		hm.put(88,"X");
		hm.put(44,"M");
		
		hm.forEach((k,v) -> System.out.println(k+" "+v));
	
		 System.out.println(" ");
		Set<Entry<Integer, String>> s1=hm.entrySet();
		
		Iterator<Entry<Integer, String>> itr = s1.iterator();
	      System.out.println(" ");
	      while (itr.hasNext()) {
	         System.out.println(itr.next()+" ");
	      }
	      
	      
	      System.out.println(" ");
		 Set<Integer> ks = hm.keySet();
		 System.out.println(ks+ " ");
		 
		
		 for (Map.Entry<Integer, String> entry :hm.entrySet()) 
	        {
	            Integer key = entry.getKey();
	            String value = entry.getValue();
	  
	            System.out.println(key + " : " + value);
	        }
	}

}
