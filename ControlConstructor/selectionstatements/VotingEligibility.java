package com.raju.selectionstatements;
import java.util.Scanner;

public class VotingEligibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your age=");
		int age=sc.nextInt();
		checkEligibilityForVoting(age);
	}

	public static void checkEligibilityForVoting(int age) {
		// checking eligibility
		if(age>=18)
		{
			System.out.println("your are eligible");
		}
		else
		{
			System.out.println("your not eligible");
		}
		
	}

}
