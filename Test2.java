import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		/*
		 * if statement execute only true value
		 * 
		 * if(test expression)
		 * {
		 *     code
		 *}
	
		 * 
		 * */
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		int no1=sc.nextInt();
		if(no1%2==0) {
			System.out.println("Even..");
		}

	}

}
