package com.sunbeam;

import java.util.Scanner;

public class Q2_Search {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = {10,20,30,40,50,60,70};
		
		System.out.print("Enter the key to be search : ");
		int key = sc.nextInt();
		
		int comps = linearSerch(arr, key);
		if(comps == -1)
		{
			System.out.println("Key not found ");
		}
		else
		{
			System.out.println("No.of comparisions : "+ comps);
		}
		
		binarySearch(arr, key);
	}

	private static int linearSerch(int arr[], int key) {
		int comps=-1;
		for(int i=0; i< arr.length-1; i++)
		{
			comps++;
			
			if(key == arr[i])
			{
				break;
			}
		}
		return comps;
	}

	private static int binarySearch(int[] arr, int key) {
		int left=0;
		int right=arr.length-1;
		int mid;
		int comps=0;
		
		while(left <= right)
		{
			comps++;
			mid = (left+right)/2;
			if(key == arr[mid])
			{
				break;
			}
			else if(key < arr[mid])
			{
				right = mid-1;
			}
			else
				left = mid +1;

		}System.out.println("No.of comparisions for binary search : "+comps);
		return comps;
	}
}

