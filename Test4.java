import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name:");
		String name=sc.next();
		System.out.println("Enter Number:");
		int age=sc.nextInt();

		System.out.println("Name:"+name+"Age:"+age);
		
		if(age>=18) {
			System.out.println("Eligible for Voting...");
		}
		else {
			System.out.println(" Not Eligible for Voting...");
		}
	}

}
