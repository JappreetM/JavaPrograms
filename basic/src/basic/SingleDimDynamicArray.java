package basic;

import java.util.Arrays;
import java.util.Scanner;

public class SingleDimDynamicArray {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter Array size");
	int size = sc.nextInt();
	int[] arr = new int[size];
	System.out.println("Enter Integers");
	for(int i=0;i<size;++i)
	{
		arr[i] = sc.nextInt();
		
	}
	
	System.out.println("Array is:");
	for(int k:arr)
	{
		System.out.println(k);
		
	}
	
	Arrays.sort(arr);
	
	System.out.println("Array after sorting is: ");
	for(int k:arr)
	{
		System.out.println(k);
		
	}
	
	System.out.println("Maximum number in array is: " +arr[size-1]);
	System.out.println("2nd Maximum number in array is: " +arr[size-2]);
	System.out.println("Minimum number in array is: " +arr[0]);
	
	
	}


}
