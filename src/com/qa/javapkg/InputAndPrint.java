// Java program to take an integer
// as input and print it
package com.qa.javapkg;

import java.util.Scanner;

public class InputAndPrint {

	public static void main(String[] args) {
		int num;
		float fl;
		String s;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any string");
		s= sc.nextLine();
		System.out.println("Entered string value is:"+s);
		
		System.out.println("Enter any integer");
		num = sc.nextInt();
		System.out.println("Entered integer is:"+num);
		
		System.out.println("Enter any float value");
		fl = sc.nextFloat();
		System.out.println("Entered float value is:"+fl);
		
		
		
		
		

	}

}
