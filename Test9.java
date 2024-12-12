import java.util.Scanner;

public class Test9 {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter how many numbers u want to add:");
		int count=sc.nextInt();
		
		int sum=0;
		for(int j=1;j<=count;j++) {
			sum=sum+j;
		}
		System.out.println("Sum is:"+sum);
	}

}
