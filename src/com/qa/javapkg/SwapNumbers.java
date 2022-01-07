package com.qa.javapkg;

public class SwapNumbers {

	public static void main(String[] args) {
		int a, b, temp;
		a=10;
		b=5;
		System.out.println("Before swapping a="+a);
		System.out.println("Before swapping b="+b);
		temp=a;//temp=10
		a=b;//a=5
		b=temp;//b=10
		System.out.println("After swapping a="+a);
		System.out.println("After swapping b="+b);

	}

}
