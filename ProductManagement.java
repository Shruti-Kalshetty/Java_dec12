import java.util.Scanner;

public class ProductManagement {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter store Name:");
		String storeName=sc.next();
		System.out.println("Welcome to "+storeName);
		int ch;
		String pname = null;
		int prise=0,qty = 0;
		int totalBill=0;
		do {
			System.out.println("Press 1:Enter Product Name:");
			System.out.println("Press 2:Enter Product Prise");
			System.out.println("Press 3:Enter Product quantity");
			System.out.println("Press 4:Calculate Total Bills");
			System.out.println("Press 5:Show All Data");
			System.out.println("Press 6:Exit from Store");
			System.out.println("Enter choice:");
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enter Product Name:");
				pname=sc.next();
				
			break;
			case 2:
				System.out.println("Enter Product prise:");
				prise=sc.nextInt();
				
			break;
			case 3:
			System.out.println("Enter Product quantity:");
			qty=sc.nextInt();
			
		break;
			case 4:
			 totalBill=prise*qty;
				
			break;
			case 5:
				System.out.println("Product Name:"+pname+
						"\nProduct Prise:"+prise+"\nQuantity:"+qty+"\nTotal Bill:"+totalBill);
			break;
			case 6:
				System.out.println("Exiting....keep shooping");
			break;
			default:
				System.out.println("Wrong choice:");
				}
		}while(ch!=6);

	}

}
