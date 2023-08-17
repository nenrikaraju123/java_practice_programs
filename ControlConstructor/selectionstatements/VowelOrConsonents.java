package com.raju.selectionstatements;
import java.util.Scanner;

public class VowelOrConsonents {

	public static void main(String[] args) {
		//taking user input
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your char=");
		char ch=sc.next().charAt(0);
		checkingVowelOrConsonents(ch);
	

	}

	public static void checkingVowelOrConsonents(char ch) {
		// checking the vowel
		if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'|| ch=='E'||ch=='I'||ch=='O'||ch=='U')
		{
		 System.out.println("given char "+ch+" is vowel");
		}
		else
			System.out.println("Given character "+ch+" is conconent");
		
	}

}
