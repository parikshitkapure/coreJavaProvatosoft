package Assignment1;

import java.util.Scanner;

public class Q_2_ReverseStringWithInBuilt {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		//StringBuffer sb = new StringBuffer(str);
		//System.out.println(sb.reverse());
		
		StringBuilder sbl = new StringBuilder(str);
		System.out.println(sbl.reverse());
		
	}

}
