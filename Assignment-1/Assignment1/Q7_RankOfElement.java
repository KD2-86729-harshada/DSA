package com.sunbeam;

import java.util.Scanner;

public class RankOfElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] =  { 10, 20, 15, 3, 4, 4, 1 } ;
		System.out.print("Enter the element : ");
		int ele = sc.nextInt();
		
		int val =rankOfElement(arr, ele);
		System.out.println("Rank of "+ele +" is "+val);
	}

	private static int rankOfElement(int[] arr, int ele) {
		int count = 1;
		for(int i=0; i< arr.length-1; i++)
		{
			if(ele == arr[i] || ele > arr[i])
				count++;
		}
		return count;
	}

}
