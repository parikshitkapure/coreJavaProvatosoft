package Assignment1;

public class Q_25_BubbleSort {

	public static void main(String[] args) {

    int arr[]= {1,20,11,3,2};
    for(int i : arr)
    {
    	System.out.print(i+" ");
    }
    bubbleSort(arr);
    System.out.println(" ");
    System.out.println("after sorting");
    for(int i : arr)
    {
    	System.out.print(i+" ");
    }
	}

	public static void bubbleSort(int[] arr) {
	
		int temp =0;
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<(arr.length-i);j++)
			{
				if(arr[j-1]>arr[j])
				{
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}

}
