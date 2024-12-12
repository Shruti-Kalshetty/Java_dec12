import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		int no1=sc.nextInt();
		if(no1%2==0) {
			System.out.println("Even..");
		}
		
		else {
			System.out.println("Odd no..");
		}

	}

}
