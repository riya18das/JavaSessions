package com.qa.javapkg;

import java.util.Scanner;

public class PrimeNos {

	public static void main(String[] args) {
		System.out.println("Enter the range value:");
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			if(i==1 || i==0)
				continue;
			int flag=1;
			for(int j=2;j<=i/2;j++) {
			if(i%j == 0) {
				flag=0;
				break;
			}
			if (flag==1)
				System.out.println(i);
			
			
			}
		}

	}
}

