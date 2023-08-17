package com.raju.selectionstatements;
import java.util.*;
public class IfDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your char=");
		char ch=sc.next().charAt(0);
		if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'|| ch=='E'||ch=='I'||ch=='O'||ch=='U')
		{
		 System.out.println("given char "+ch+" is vowel");
		}
		else
			System.out.println("its not vowel");
	
		

	}

}
