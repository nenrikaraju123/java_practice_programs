package com.raju.selectionstatements;
import java.util.Scanner;

public class CheckingNumber {

	public static void main(String[] args) {
		// taking user input
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number=");
		int number=sc.nextInt();
		checkingEvenOrOdd(number);
		sc.close();
	}

	public static void checkingEvenOrOdd(int number) {
		// checking even or odd 
		if(number%2==0)
		{
			System.out.println("Given number "+number+" is even");
		}
		else
		{
			System.out.println("Given number "+number+" is odd");
		}
		
	}
	

}
