package com.sunbeam;

import java.util.Scanner;

public class Q1_LinearSearch {
	public static int linearSerach(int arr[], int key)
	{
		for(int i = arr.length-1; i >= 0; i--)
		{
			if(key == arr[i])
			{
				return i;
			}
		}
		return -1;
		

//		int lastOcurrance=-1;
//		for(int i = 0; i < arr.length-1; i++)
//		{
//			if(key == arr[i])
//			{
//				lastOcurrance = i;
//			}
//		}
//		return lastOcurrance;
		
	}
	

	public static void main(String[] args) {
		
		int arr[] = {11, 55, 66, 22, 33, 22, 44};
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the key to be search : ");
		int key = sc.nextInt();
	
		int index = linearSerach(arr, key);
		
		if( index == -1)
		{
			System.out.println("key is not found ....");
		}
		else
		{
			System.out.println("Last ocurrance of Key found at index : "+index);
		}
	}

}
