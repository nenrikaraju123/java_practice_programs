 package com.raju.forloopdemo;

import java.util.Scanner;

public class MultiplesOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		System.out.print("Enter the number of multiples:");
		int num2=sc.nextInt();
		sc.close();
		for(int i=1;i<=num2;i++)
		{
			System.out.println(num+" * "+i+" = "+(num*i));
		}

	}

}
