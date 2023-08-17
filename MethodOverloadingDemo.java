import java.util.*;
public class MethodOverloadingDemo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the flavour:");
		String flavour=scan.next();
		System.out.print("Enter the no of tea you want to order:");
		int quantity=scan.nextInt();
		if(quantity == 0 && flavour==" ")
		orderChai();
		else if(flavour != " ")
		{
		orderChai(flavour);
		}
		else if(quantity>=0 && flavour !=" ")
		{
		orderChai(flavour,quantity);
		}
		else if(quantity >= 0)
		{
		orderChai(quantity);
		}


	}
    
	public static void orderChai(int quantity) {
		System.out.println("bill for"+" "+quantity+" "+" "+"cup of "+"tea="+(quantity*10.0));
		
	}
    


	public static void orderChai(String flavour, int quantity) {
		System.out.println("bill for"+" "+quantity+" "+" "+"cup of "+flavour+" "+"tea="+(quantity*15.0));
		
	}

	public static void orderChai(String flavour) {
		System.out.println("bill for cup of lemon tea=15.0");
		
	}

	public static void orderChai() {
		System.out.println("bill for cup of tea=10.0");
		
		
	}

}


