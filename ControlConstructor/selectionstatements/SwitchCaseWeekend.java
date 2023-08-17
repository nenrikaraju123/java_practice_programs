package com.raju.selectionstatements;
import java.util.Scanner;

public class SwitchCaseWeekend {

	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("enter a number");
    int number =scan.nextInt();
    SwitchCaseWeekend2 w1 = new SwitchCaseWeekend2();
    w1.switchCaseWeekend(number);
	}

}

class SwitchCaseWeekend2 {

	public void switchCaseWeekend(int number) {
		switch(number)
		{
		case 1:
		{
			System.out.println("This is sunday");
		}
		break;
		case 2:
		{
			System.out.println("This is monday");
		}
		break;
		case 3:
		{
			System.out.println("This is tuesday");
		}
		break;
		case 4:
		{
			System.out.println("This is wednesday");
		}
		break;
		case 5:
		{
			System.out.println("This is thursday");
		}
		break;
		case 6:
		{
			System.out.println("This is friday");
		}
		break;
		case 7:
		{
			System.out.println("This is saturday");
		}
		break;
		default:
		{
			System.out.println("invalid input");
		}
		}
	}
	
}
