package com.raju.forloopdemo;
import java.util.Scanner;

public class ForDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
            int num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i=num;i>=1;i--)
		{
			System.out.print(i+" ");
		}
		sc.close();
	}

}
