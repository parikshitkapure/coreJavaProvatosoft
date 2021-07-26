package Assignment1;

import java.util.*;
public class HashSet_To_Array {

	public static void main(String[] args) {
	
		HashSet<String> hs = new HashSet<>();
		hs.add("P");
		hs.add("Q");
		hs.add("Z");
		hs.add("B");
		hs.add("M");
System.out.println(hs);

String str[] = new String[hs.size()];
hs.toArray(str);

hs.forEach(s -> System.out.print(s+" "));
/*for (String s: str)
    System.out.println(s);

	*/
	}
}

