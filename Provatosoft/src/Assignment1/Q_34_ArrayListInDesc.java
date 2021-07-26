package Assignment1;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q_34_ArrayListInDesc {

	public static void main(String[] args) {
		List<String> ls = new ArrayList<String>();
		ls.add("Apple");
		ls.add("Amazon");
		ls.add("Facebook");
		ls.add("Google");
		ls.add("IBM");
		ls.add("Tesla");
		
		System.out.println(ls.toString());
		Collections.sort(ls);
		Collections.reverse(ls);
		System.out.println(ls.toString());
	}

}
