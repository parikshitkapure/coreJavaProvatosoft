package Assignment1;

import java.util.Scanner;

public class Q_3_SwapNumThirdVar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a the values of a and b");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println("after Swap a ="+a);
		System.out.println("after Swap a ="+b);
		
		
	}

}
