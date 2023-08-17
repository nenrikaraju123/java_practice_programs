package com.raju.selectionstatements;
import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the first number=");
		double num1=sc.nextDouble();
		System.out.print("Enter the Second number=");
		double num2=sc.nextDouble();
        System.out.println("Enter your choice");
        System.out.println("+  ====> addition ");
        System.out.println("-  ====> substraction");
        System.out.println("*  ====> multiplication");
        System.out.println("/  ====> divison");
        System.out.println("%  ====> modulos");
        char choice =sc.next().charAt(0);
        CalculatorApp c=new CalculatorApp();
        if(choice =='+')
        {
        	c.addition(num1,num2);
        }
        else if(choice=='-') 
        {
        	c.substraction(num1,num2);
        }
        else if(choice=='*') 
        {
        	c.multiplication(num1,num2);
        }
        else if(choice=='/')
        {
        	c.divison(num1,num2);
        }
        else if(choice=='%')
        {
        	c.modulus(num1,num2);
        }
        else
        {
        	System.out.println("Enter the valid choice");
        }
        sc.close();
        
	}
	

}
