package com.sunbeam;

import java.util.Arrays;

public class Q1_InserationSort {

	public static void main(String[] args) {
		
		int arr[] = {55, 44, 22, 66, 11, 33};
		
		System.out.println("Array before sort : "+ Arrays.toString(arr));
		
		insertionSort(arr);
		
		System.out.println("Array after sort : "+ Arrays.toString(arr));
		
	}

	private static void insertionSort(int[] arr) {
		
		for( int i = arr.length-1; i > 0; i--)
		{
			int temp = arr[i];
			int j;
			for(j = i-1; j>=0 && arr[j] < temp; j--)
			{
				arr[j+1] = arr[j];
			}
			arr[j+1] = temp;
		}
	}

}
