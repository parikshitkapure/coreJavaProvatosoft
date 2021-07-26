package Assignment1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Q_29_IterateOverArrayList {

	public static void main(String[] args) {
		List<Integer> ls = new ArrayList<Integer>();
		ls.add(10);
		ls.add(50);
		ls.add(60);
		ls.add(100);
		ls.add(20);
		ls.add(123);
		
		
		ls.forEach(intr->System.out.print(intr+" "));
		
		System.out.println(" ");
		 for (Integer intg : ls)
	            System.out.print(intg + " ");
	   
		 
		 
		Iterator itr = ls.iterator();
	      System.out.println(" ");
	      while (itr.hasNext()) {
	         System.out.print(itr.next()+" ");
	      }
	      System.out.println(" ");
	      for (int i = 0; i < ls.size(); i++) 
	            System.out.print(ls.get(i) + " ");    
	      System.out.println(" ");
	      int i = 0; 		
	      while (ls.size()>i)
	      {
		 System.out.print(ls.get(i)+" ");
	         i++;
	      }
	     
		

	}

}
