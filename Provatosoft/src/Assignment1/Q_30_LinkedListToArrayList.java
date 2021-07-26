package Assignment1;

import java.util.*;
import java.util.ArrayList;

public class Q_30_LinkedListToArrayList {

	public static void main(String[] args) {
		LinkedList<Integer> ls = new LinkedList<Integer>();
		ls.add(10);
		ls.add(50);
		ls.add(60);
		ls.add(100);
		ls.add(20);
		ls.add(123);
		
		List<Integer> l = new ArrayList<>(ls);
		
		/*
		 * for (Integer intg : l) System.out.print(intg + " ");
		 */
		 
		l.forEach(x->System.out.print(x+" "));
	}

}
