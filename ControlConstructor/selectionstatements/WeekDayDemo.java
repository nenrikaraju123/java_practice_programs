
package com.raju.selectionstatements;
import java.util.Scanner;

public class WeekDayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the day=");
		int day=sc.nextInt();
		FindingDay d=new FindingDay();
		d.findingDay(day);

	}

}
class FindingDay
{
	public void findingDay(int n)
	{
		if(n==1)
		{
			System.out.println("Sunday");
		}
		else if(n==2)
		{
			System.out.println("Monday");
		}
		else if(n==3)
		{
			System.out.println("Tuesday");
		}
		else if(n==3)
		{
			System.out.println("Wednesday");
		}
		else if(n==4)
		{
			System.out.println("Thursday");
		}
		else if(n==5)
		{
			System.out.println("Saturday");
		}
		else 
		{
			System.out.println("invalid  input");
		}
	}
}