package com.raju.selectionstatements;
import java.util.Scanner;

public class QuaterSwitchCase {

	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the month");
    String month= scan.next();
    QuaterSwitchCase2 q1 = new QuaterSwitchCase2();
 q1.quaterSwitchCase(month);
	}

}

class QuaterSwitchCase2{

	public void quaterSwitchCase(String month) {
		switch(month)
		{
		case"jan":
		case"feb":
		case"mar":
		{
			System.out.println("quater 4");
		}
		break;
		case"april":
		case"may":
		case"june":
		{
			System.out.println("quater1");
		}
		break;
		case"july":
		case"agust":
		case"sept":
		{
			System.out.println("quater 2");
		}
		break;
		case"oct":
		case"nov":
		case"dec":
		{
			System.out.println("quater 3 ");
		}
		break;
		default:
		{
			System.out.println("invalid input");
		}
		}
	}
	
}
