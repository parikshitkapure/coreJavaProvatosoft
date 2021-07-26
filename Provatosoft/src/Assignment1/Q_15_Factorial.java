package Assignment1;

import java.util.Scanner;

public class Q_15_Factorial {

		public static void main(String args[]){  
			  int fact=1;  
			  Scanner sc = new Scanner(System.in);
			  System.out.println("Enter a number");
			  int n=sc.nextInt();
			  for(int i=1;i<=n;i++){    
			      fact=fact*i;    
			  }    
			  System.out.println(n+" Factorial is: "+fact);    
				sc.close();
			 }  
	
}
