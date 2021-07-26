package Assignment1;

import java.util.*;
import java.util.ArrayList;
import java.util.TreeSet;
public class ArrayToTreeSet {

	public static void main(String[] args) {

		Integer arr[]= {10,5,66,12,33,44};
        List<Integer> ls=  Arrays.asList(arr);
        Set<Integer> ts = new TreeSet<Integer>(ls);
	System.out.println("TreeSet elements:");
	System.out.println(ts);
    }

	}


