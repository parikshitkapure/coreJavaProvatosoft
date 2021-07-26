package Assignment1;

public class Q_26_ReverseArray {

	public static void main(String[] args) {
		int arr[]= {3,8,5,7,4};
		int arr2[]= {10,54,23,89,97,2};
		
		for(int i =0 ;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
			
		}
		System.out.println(" ");
		System.out.println("Rev array ");
		for(int i =arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
		
		System.out.println(" ");
		for(int i =0 ;i<arr2.length;i++)
		{
			System.out.print(arr2[i]+" ");
			
		}
		System.out.println(" ");
		System.out.println("Rev array ");
		for(int i =arr2.length-1;i>=0;i--)
		{
			System.out.print(arr2[i]+" ");
		}
	}

}
