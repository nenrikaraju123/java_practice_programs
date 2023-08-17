package com.raju.selectionstatements;
import java.util.Scanner;

public class GradingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter your marks=");
		int marks=sc.nextInt();
		FindingGrades g=new FindingGrades();
		g.grades(marks);
		

	}

}
class FindingGrades
{
	public void grades(int marks)
	{
		if(marks>90)
		{
			System.out.println("A grade");
		}
		else if(marks>75 && marks<=90)
		{
			System.out.println("B grade");
		}
		else if(marks>60 && marks<=75)
		{
			System.out.println("C  grade");
		}
		else if(marks>45 && marks<=60)
		{
			System.out.println("D grade");
		}
		else if(marks>=35 && marks<=45)
		{
			System.out.println("E grade");
		}
		else 
		{
			System.out.println("try next semester");
		}
	}
}
