package Assignment1;

import java.util.Scanner;

public class Q_1_ReverseStringWithoutInBuilt2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		 
		char[] strArray = str.toCharArray();
		 
		for (int i = strArray.length - 1; i >= 0; i--)
		{
		    System.out.print(strArray[i]);   
		}
	}

}
