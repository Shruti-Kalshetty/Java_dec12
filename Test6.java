import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Student Id:");
		
		int sId=sc.nextInt();
		
		System.out.println("Enter Student Name:");
		
		String name=sc.next();
		System.out.println("Enter choice for Specific stream:");
		int choice=sc.nextInt();
	
		switch(choice) {
		  
		case 1:
			System.out.println("IT");
		break;
		case 2:
			System.out.println("CSE");
		break;
		case 3:
			System.out.println("ETC");
		break;
		case 4:
			System.out.println("Mechanical");
		break;
		case 5:
			System.out.println("Chemical");
		break;
		default:
			System.out.println("wrong choice");
		
		}
		

	}

}
