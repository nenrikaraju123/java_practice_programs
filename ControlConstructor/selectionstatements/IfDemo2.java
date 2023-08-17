package com.raju.selectionstatements;
import java.util.Scanner;

public class IfDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number=");
		int num=sc.nextInt();
		if(num>0)
		{
			System.out.println("given num "+num+" is positive");
		}
		else
			System.out.println(" given  num "+num+"is negative");
			

	}

}
