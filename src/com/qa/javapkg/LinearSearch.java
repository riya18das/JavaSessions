package com.qa.javapkg;

public class LinearSearch {

	public static void main(String[] args) {
		int arr[]= {5,10,15,20,25,30};
		int n=16;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==n)
				System.out.println("Element found at position"+i);
			else
				System.out.println("Element not found");
		}
	}

}
