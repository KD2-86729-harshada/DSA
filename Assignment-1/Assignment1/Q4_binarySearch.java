import java.util.Arrays;
import java.util.Scanner;

public class Q4_binarySearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = {90,80,70,60,50,40,30,20,10};
		
		System.out.println("Array : "+ Arrays.toString(arr));
		
		System.out.println("Enter the key to be search : ");
		int key = sc.nextInt();
		
		int index = binarySerach(arr,key);
		if(index == -1)
		{
			System.out.println("Key dose not found ....");
		}
		else
			System.out.println("Key found at postion : "+index);
		
		sc.close();
	}

	private static int binarySerach(int arr[], int key) {
		
		int left=0;
		int right = arr.length-1;
		int mid;
		
		while (left <= right) {
			mid = (left+right)/2;
			if(key == arr[mid])
			{
				return mid;
			}
			else if(key < arr[mid])
			{
				left = mid+1;
			}
			else
			{
				right = mid-1;
			}
		}
		return -1;
	}
}
