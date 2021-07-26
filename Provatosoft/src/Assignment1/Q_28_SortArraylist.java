package Assignment1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q_28_SortArraylist {

	public static void main(String[] args) {
		List<Integer> ls = new ArrayList<Integer>();
		ls.add(10);
		ls.add(50);
		ls.add(60);
		ls.add(100);
		ls.add(20);
		ls.add(123);
		System.out.println(ls.toString());
		Collections.sort(ls);
		System.out.println(ls.toString());
	}

}
