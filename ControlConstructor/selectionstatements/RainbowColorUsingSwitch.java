package com.raju.selectionstatements;
import java.util.*;
public class RainbowColorUsingSwitch {

	public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          System.out.print("Enetr the color:");
          char color=sc.next().charAt(0);
          findColor(color);
	}
	public static void findColor(char ch)
	{
		switch(ch)
		{
		case 'v':
		case 'V':
		{
			System.out.println("VIOLET");
			break;
		}
		case 'i':
		case 'I':
		{
			System.out.println("INDIGO");
			break;
		}
		case 'b':
		case 'B':
		{
			System.out.println("BLUE");
			break;
		}
		case 'g':
		case 'G':
		{
			System.out.println("GREEN");
			break;
		}
		case 'Y':
		case 'y': 
		{
			System.out.println("YELLOW");
			break;
		}
		case 'o':
		case 'O':
		{
			System.out.println("ORANGE");
			break;
		}
		case 'r':
		case 'R':
		{
			System.out.println("RED");
			break;
		}
		default:
			System.out.println("invalid user input");
		}
	}

}
