import java.util.*;
public class Method4 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        System.out.print("Enter the first Number:");
        int a=scan.nextInt();
        System.out.print("Enter the second Number:");
        int b=scan.nextInt();
        int sum=addNumbers(a,b);
        System.out.println("The sum="+sum);
        scan.close();
	}

	public static int addNumbers(int x, int y) {
		// TODO Auto-generated method stub
		//int sum=a+b;
		return x+y;
	}

}
