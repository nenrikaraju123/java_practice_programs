package com.raju.selectionstatements;
import java.util.Scanner;

public class SwitchCaseCalculator {

	public static void main(String[] args) {
    Scanner scan =new Scanner(System.in);
    System.out.println("Enter first number");
    int num1 = scan.nextInt();
    System.out.println("Enter second number");
    int num2 = scan.nextInt();
    System.out.println("+ ===>Addition");
    System.out.println("- ===>subtraction");
    System.out.println("* ===>multiplication");
    System.out.println("/ ===>division");
    System.out.println("% ===>remainder");
    System.out.println("choice one");
    char choice = scan.next().charAt(0);
    SwitchCaseCalculatorApp c1 =new SwitchCaseCalculatorApp();
    c1.switchCalculator(num1,num2,choice);
	}

}

 class SwitchCaseCalculatorApp{
	public void switchCalculator(int num1,int num2,char choice) {
		switch(choice)
		{
		case '+':
		{
			System.out.println(num1+num2);
		}
		break;
		case '-':
		{
			System.out.println(num1-num2);
		}
		break;
		case '*':
		{
			System.out.println(num1*num2);
		}
		break;
		case '/':
		{
			System.out.println(num1/num2);
		}
		break;
		case '%':
		{
			System.out.println(num1%num2);
		}
		break;
		default:
		{
			System.out.println("invalid input");
		}
		}
	}
}


