package com.sunbeam;
public class NonRepeat {
	
	public static void main(String[] args) {
		
		int arr[] =  { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 };
		
		serchElement(arr);
	}

	private static void serchElement(int[] arr) {
		
		for(int i=0; i<arr.length; i++)
		{
			int flag = 0;
			for(int j=i+1; j < arr.length; j++)
			{
				if(arr[i] == arr[j])
				{
//					System.out.println(arr[i]+" "+arr[j]);
					flag = 1;
				}
//				else
//				{
//					flag=0;
//					
//				}
			}
			if( flag == 0)
			{
				System.out.println("Non repeating element is "+ arr[i]);
				break;
			}
		}	
	}

}
