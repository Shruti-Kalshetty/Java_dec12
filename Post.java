import java.util.Scanner;

public class Post {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter post Id:");
		
		int postId=sc.nextInt();
		
		System.out.println("Enter post Name:");
		
		String postName=sc.next();
		
		System.out.println("Enter posted Date");
		
		String postedDate=sc.next();
		
		System.out.println("Enter number of likes:");
		int likes=sc.nextInt();
		
		System.out.println(postId+" "+postName+" "+postedDate+" "+likes);
	}

}
