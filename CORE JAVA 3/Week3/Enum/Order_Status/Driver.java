package Week3.Enum.Order_Status;

import java.util.Scanner;

public class Driver {



	public static void main(String[] args) {
		Order order= new Order();
		order.orderId=1;
		order.orderName="Shirt";
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter Order Id:");
		
        System.out.println("1. PENDING");
        System.out.println("2. APPROVED");
        System.out.println("3. DELIVERED");
        System.out.println("4. CANCELLED");

        int choice = userInput.nextInt();
        userInput.nextLine();
        System.out.println("Order Id :"+ order.orderId);
		System.out.println("Order Name :"+ order.orderName);

        switch (choice) {
		case 1:
			order.status=Status.PENDING;
			System.out.println("Order Status:"+"Order is pending");
			break;
		case 2:
			order.status=Status.APPROVED;
			System.out.println("Order Status:"+"Order is approved");
			break;
		case 3:
			order.status=Status.DELIVERED;
			System.out.println("Order Status:"+"Order is delivered");
			break;
		case 4:
			order.status=Status.CANCELLED;
			System.out.println("Order Status:"+"Order is cancelled");
			break;
		default:
			System.out.println("Invalid choice");
			break;
		}
        
	}

}
