package Assignment1;

import java.util.Scanner;

public class Q_19_StringPalindrom {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		  System.out.println("Enter a string");  
		
		  String org = sc.nextLine();
		
		  String rev="";  
	    
	   
	        
	      for ( int i = org.length()-1; i >= 0; i-- ) 
	      {
	    	  rev = rev + org.charAt(i);  
	 	     
	      }
	         
	      if (org.equals(rev))  
	         System.out.println("string is a palindrome");  
	      else  
	         System.out.println("string not palindrome.");   
	   }  

	}


