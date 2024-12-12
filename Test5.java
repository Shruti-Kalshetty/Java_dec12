import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter value for a:");
		int a=sc.nextInt();

		System.out.println("Enter value for b:");
		int b=sc.nextInt();
		

		System.out.println("Enter value for c:");
		int c=sc.nextInt();
		
		if(a>b && a>c) {
			System.out.println("A is having highest value");
		}
		else if(b>a && b>c) {
			System.out.println("B is having highest value");
		}
		else {
			System.out.println("C is having highest value");
		}
	}

}
