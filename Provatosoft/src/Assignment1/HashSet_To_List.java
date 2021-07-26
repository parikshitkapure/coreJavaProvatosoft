package Assignment1;

import java.util.*;
import java.util.ArrayList;
public class HashSet_To_List {

	public static void main(String[] args) {
	
		HashSet<String> hs = new HashSet<>();
		hs.add("P");
		hs.add("Q");
		hs.add("Z");
		hs.add("B");
		hs.add("M");
System.out.println(hs);
 
List<String> ls = new ArrayList<String>(hs);
System.out.println(ls);
	}
	
	}


