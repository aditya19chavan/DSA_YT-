package searchingAlgo;

import java.util.Arrays;
import java.util.Scanner;

public class recurssionBinarysearch {

	
	
	public static int recBinarySearch(int[] arr, int left, int right, int key ) {
		if(right < left)
			return -1;
		int index,mid = (left + right)/2;
		
		if(key == arr[mid])
			return mid;
		if(key < arr[mid])
		 return	recBinarySearch(arr, left,mid-1,key);
		else 
			return recBinarySearch(arr, mid+1,right,key);

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr  =  {66,55,23,54,68,54,63,22};
		Arrays.sort(arr);
		int key = sc.nextInt();

		int index = recBinarySearch(arr,0,arr.length-1, key);
		if(index != -1)
			System.out.println("key found at index: " +index);
		else
			System.out.println("key not found");



	}

}
