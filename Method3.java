import java.util.*;
public class Method3 {

	public static void main(String[] args) {
		int sum=addNumbers();
		System.out.println("the sum="+sum);
		
		

	}


	public static int addNumbers(){
		Scanner scan=new Scanner (System.in);
		System.out.print("Enter the first Number:");
        int a=scan.nextInt();
        System.out.print("Enter the second Number:");
        int b=scan.nextInt();
        //t sum=a+b;//
        return a+b;
		
		
	}

}
