package com.raju.forloopdemo;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
     int num=sc.nextInt();
     int sum=0;
     for(int i=1;i<=num;i++)
     {
    	 sum+=i;
     }
     System.out.println("Sum"+sum);
     sc.close();
	}

}
