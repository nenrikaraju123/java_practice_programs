package com.raju.selectionstatements;
import java.util.Scanner;

public class CheckingCharacter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your char=");
		char ch=sc.next().charAt(0);
		checkingCharacter(ch);

	} 

	public static void checkingCharacter(int ch) {
		// TODO Auto-generated method stub
		if(ch>=65 && ch<=90)
			System.out.println("Given character  is upper case");
		else if(ch>=97 && ch<=122)
			System.out.println("Given character is lower case");
		else if(ch>=48 && ch<=57)
			System.out.println("Given character  is digit");
		else
			System.out.println("Given character  is special character");
			
		
	}

}
