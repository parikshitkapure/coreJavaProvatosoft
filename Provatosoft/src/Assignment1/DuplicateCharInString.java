package Assignment1;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class DuplicateCharInString {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a String");
	String str = sc.nextLine();
	duplicateChar(str);
	
	

	}

	public static void duplicateChar(String str) {
		
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		 char[] chArray = str.toCharArray();
         
	        for (char c : chArray)
	        {
	            if(hm.containsKey(c))
	            {
	                  hm.put(c, hm.get(c)+1);
	            }
	            else
	            {
	                hm.put(c, 1);
	            }
	       }
	        Set<Character> setch = hm.keySet();
	        
	        System.out.println("Duplicate Characters In "+str);
	        for (Character ch : setch)
	        {
	            if(hm.get(ch) > 1)
	            {
	                System.out.println(ch +" : "+ hm.get(ch));
	            }
	        }
	    }
	}



