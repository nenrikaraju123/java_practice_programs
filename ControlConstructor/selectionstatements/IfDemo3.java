package com.raju.selectionstatements;
import java.util.Scanner;

public class IfDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number=");
		int num=sc.nextInt();
		if(num%2==0)
		{
			System.out.println("given num "+num+" is even");
		}
		else
			System.out.println(" given  num "+num+"is odd");

	}

}
