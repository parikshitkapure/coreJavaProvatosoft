package Assignment1;

import java.util.Scanner;
import java.math.*;
public class Q_11_ArmstrongNumber {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 int n = sc.nextInt();
	 int res=0;
	 int org = n;
	 int num = String.valueOf(n).length();
	 
	 while(org!=0)
	 {
		 int rem=org % 10;
	      res=(int) (res+Math.pow(rem,num));
	      org=org/10;
		 
	 }
	 if(res==n)
	 {
		 System.out.println("numbers is armstrong num");
	 }
	 else 
	 {
		 System.out.println("num is not a armstrong num");
	 }
	}

}
