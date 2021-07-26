package Assignment1;

public class Q_21_MaxValueInArray {

	public static void main(String[] args) {
		int arr[]= {1,7,91,12,57};
		int max = arr[0];
		for(int i= 0;i<arr.length;i++)
		{
			if(arr[i]>max)
				max=arr[i];
		}
		
System.out.println("maximum in array is "+max);
	}

}
