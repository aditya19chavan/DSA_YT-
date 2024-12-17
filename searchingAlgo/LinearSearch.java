package searchingAlgo;

import java.util.Scanner;

public class LinearSearch {
	
	
	public static int linearSearch(int[] arr,int key) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key)
				return i;
		}
		return -1;
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int [] arr = {66,55,23,54,68,54,63,22};
		System.out.println("Enter key to search: ");
		int key = sc.nextInt();
		int index = linearSearch(arr,key);
		if(index != -1)
			System.out.println("Key found at index: " +index);
		else
			System.out.println("key not found");
		

	}

}
