package Assignment1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q_8_CountWordsInString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		  
        HashMap<String, Integer> hashMap = new HashMap<>();
  
        String[] words = str.split(" ");
  
        for (String wd : words) {
            
            if (hashMap.containsKey(wd))
                hashMap.put(wd, hashMap.get(wd) + 1);
  
            else
                hashMap.put(wd, 1);
        }
  
        System.out.println(hashMap);

	}

}
