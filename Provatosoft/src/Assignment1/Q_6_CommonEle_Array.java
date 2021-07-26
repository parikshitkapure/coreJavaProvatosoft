package Assignment1;

import java.util.Arrays;

public class Q_6_CommonEle_Array {

	public static void main(String[] args) {
		int arr1[]= {1,4,7,9,2};
		int arr2[]= {1,7,3,4,5};
		System.out.println("Arr1 : "+Arrays.toString(arr1));
	       System.out.println("Arr2 : "+Arrays.toString(arr2));
	 
	      
	        for (int i = 0; i < arr1.length; i++)
	        {
	            for (int j = 0; j < arr2.length; j++)
	            {
	                if(arr1[i] == (arr2[j]))
	                {
	                 
	                 System.out.println("Common element is : "+(arr1[i]));
	                 }
	            }
	        }
	}

}
