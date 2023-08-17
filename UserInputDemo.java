import java.util.*;
public class UserInputDemo {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.print("Enter Your Name:");
		String name=scan.nextLine();
		System.out.print("Enter your age:");
		int age=scan.nextInt();
		System.out.print("Enter your gender:");
		char gender=scan.next().charAt(0);
		System.out.print("Enter your salary:");
		double salary=scan.nextDouble();
		System.out.println("Name="+name);
		System.out.println("Gender="+gender);
		System.out.println("Age="+age);
		System.out.println("salary="+salary);
		scan.close();
		
		
	}

}
