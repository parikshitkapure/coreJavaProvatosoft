package Assignment1;

import java.util.List;
import java.util.ArrayList;

public class ArrayListToStringArray {

	public static void main(String[] args) {
	
		List<String> ls = new ArrayList<String>();
		ls.add("Hello");
		ls.add("Hi");
		ls.add("How ");
		ls.add("Are");
		ls.add("You");
		
		ls.forEach(x->System.out.print(x+" "));
		System.out.println(" ");
		System.out.println(ls.toString());
	}

}
