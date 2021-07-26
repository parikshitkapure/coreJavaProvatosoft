package Assignment1;

import java.util.*;
import java.util.Scanner;
import java.util.HashMap;


public class Q_5_FirstNonRepeatingChar {

	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String str= sc.nextLine();
     int l = str.length();
     HashMap<Character,Integer> hm= new HashMap<Character,Integer>();
      Character ch;
      for(int i = 0; i<l;i++)
      {
    	  ch=str.charAt(i);
    	  
    		  if(hm.containsKey(ch))
    		  {
    			  hm.put(ch,hm.get(ch)+1);
    		  }
    		  else
    		  {
    			hm.put(ch, 1);  
    		  }
    	  }
    	  for(int j =0;j<l;j++)
    	  {
    		  ch=str.charAt(j);
    		  if(hm.get(ch)==1)
    		  {
    			  System.out.println("non repeating char in String :"+ch);
    			  break;
    		  }
    	  }
      }

	}


