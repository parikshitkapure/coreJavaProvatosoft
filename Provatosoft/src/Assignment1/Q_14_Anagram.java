package Assignment1;
import java.util.*;
import java.util.Scanner;

public class Q_14_Anagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a first String");
		String str1 = sc.nextLine();
		System.out.println("enter a second String");
		String str2 = sc.nextLine();
		
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
		if(str1.length()==str2.length())
		{
			char ch1[]=str1.toCharArray();
			char ch2[]=str2.toCharArray();
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			if(Arrays.equals(ch1,ch2)==true)
			{
				System.out.println("string are anagram");
			}
			
		}
		else
			System.out.println("strings are not anagram");
		
		

	}

}
