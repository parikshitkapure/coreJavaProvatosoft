package Assignment1;

import java.util.Scanner;

public class Q_12_PrimeNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a num");
		int n = sc.nextInt();
		int count = 0;
		for(int i=2;i<n;i++)
			if(n%2==0)
			{
	            count++;
				break;
			}
				if(count>0) 
				{
					System.out.println("number is not prime");
				}
				else
			{
				System.out.println("number is prime");
			}
		

	}

}
