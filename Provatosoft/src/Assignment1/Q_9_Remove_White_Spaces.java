package Assignment1;

import java.util.Scanner;

public class Q_9_Remove_White_Spaces {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter input string");
         
        String Str = sc.nextLine();
         
        String str2 = Str.replaceAll("\\s+", "");
         
        System.out.println("Entered String : "+Str);
         
        System.out.println("String Without Spaces : "+str2);
         
        sc.close();

	}

}
