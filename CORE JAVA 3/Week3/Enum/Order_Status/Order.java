package Week3.Enum.Order_Status;
enum Status{
	PENDING,APPROVED,DELIVERED,CANCELLED;
	
}
public class Order {
     int orderId;
     String orderName;
     Status status;
}
