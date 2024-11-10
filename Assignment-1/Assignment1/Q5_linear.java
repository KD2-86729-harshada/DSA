package com.sunbeam;

import java.util.Scanner;

public class Q5_linear {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		int arr [] = {20, 50, 90, 40, 20 ,10, 20, 30, 20};
		
		System.out.println("Enter the key to serach : ");
		int key = sc.nextInt();
		
		System.out.println("Enter the ocuurance to serach : ");
		int ocu = sc.nextInt();
		
		int i =linearSearch(arr, key,ocu);
		System.out.println("ocurrance of given element : "+ i );
	}

	private static int linearSearch(int[] arr, int key, int ocu) {
		int count = 0;
		
		for(int i = 0; i <= arr.length-1; i++)
		{
			if(key == arr[i])
			{
				count++;
				System.out.println(count);
				if(count == ocu)
				{
					return i;
				}
			}
		}
		return -1;
	}

}
