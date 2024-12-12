import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		int no1=1;
		
		while(no1<=10) {
			System.out.println(no1);
			no1++;
			//no1=no1+1;
		}
		
		System.out.println("10 to 1");
		
		int j=10;
		while(j>=1) {
			System.out.println(j);
			j--;
		}
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int no=sc.nextInt();
		
		int x=1;
		while(x<=10) {
			System.out.println(no+"X"+x+"="+(no*x));
			x++;
		}
		

	}

}
