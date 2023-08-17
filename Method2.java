import java.util.*;
public class Method2 {

	public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            System.out.print("Enter the first Number:");
            int a=scan.nextInt();
            System.out.print("Enter the second Number:");
            int b=scan.nextInt();
            addNumbers(a,b);
            scan.close();
            
	}

	public static void addNumbers(int a, int b) {
		int sum=a+b;
		System.out.println("The sum="+sum);
		
	}

}
