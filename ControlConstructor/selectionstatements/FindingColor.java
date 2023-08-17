package com.raju.selectionstatements;
import java.util.Scanner;

public class FindingColor {

	public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
           System.out.print("Enter character=");
           char color=sc.next().charAt(0);
           Color c=new Color();
           c.findingcolor(color);
           
           
           
	}

}
class Color
{
	public void findingcolor(char ch)
	{
		if(ch=='v' || ch=='V')
		{
			System.out.println("violet");
		}
		else if(ch=='i' || ch=='I')
		{
			System.out.println("Indio");
		}
		else if(ch=='B' || ch=='b')
		{
			System.out.println("Blue");
		}
		else if(ch=='g' || ch=='G')
		{
			System.out.println("Green");
		}
		else if(ch=='y' || ch=='Y')
		{
			System.out.println("Yellow");
		}
		else if(ch=='o' || ch=='O')
		{
			System.out.println("Orange");
		}
		else if(ch=='R' || ch=='r')
		{
			System.out.println("Red");
		}
		else
		{
			System.out.println("color is not in VIBGYOR");
		}
		
	}
	
}
