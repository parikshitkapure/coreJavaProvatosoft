package Assignment1;

import java.util.*;
import java.util.ArrayList;


public class Q_27_ReverseTheArrayList {

	public static void main(String[] args) {
		List<String> ls = new ArrayList<String>();
		ls.add("Apple");
		ls.add("Amazon");
		ls.add("Facebook");
		ls.add("Google");
		ls.add("IBM");
		ls.add("Tesla");
		
		System.out.println(ls.toString());
		Collections.reverse(ls);
		System.out.println(ls.toString());
		
		

	}

}
