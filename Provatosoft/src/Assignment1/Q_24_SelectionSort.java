package Assignment1;

public class Q_24_SelectionSort {

	public static void main(String[] args) {
		int arr[]= {1,5,10,7,3,22,6};
		
		System.out.println("before sorting");
		for(int i =0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
			
		}
		selectionSort(arr);
		System.out.println("after sorting");
		for(int i =0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
			
		}
		
	}

	public static void selectionSort(int[] arr) {
		
		for(int i=0;i<arr.length-1;i++)
			
		{
			int min=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[min])
				{
					min=j;
				}
			}
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
	}

}
