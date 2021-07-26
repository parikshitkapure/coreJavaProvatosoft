package Assignment1;

import java.util.HashMap;

public class Q_16_CountEachChar
{
    private static void charCount(String inputString)
    {
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
  
         char[] strArray = inputString.toCharArray();
         
        for (char c : strArray)
        {
            if(hm.containsKey(c))
            {
                  hm.put(c, hm.get(c)+1);
            }
            else
            {
                hm.put(c, 1);
            }
        }
        System.out.println(inputString+" : "+hm);
    }
  
    public static void main(String[] args)
    {
       charCount("Java Hungry");  
    }
}