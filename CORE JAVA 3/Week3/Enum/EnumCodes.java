package Week3.Enum;
enum OrderStatus {
PLACED(1),
SHIPPED(2),
DELIVERED(3);
private int code;
OrderStatus(int code) { //constructor
    this.code = code;
}
public int getCode() { //method to get status codes 
    return code;
}
}
public class EnumCodes {
	public static void main(String[] args) {
		OrderStatus status = OrderStatus.SHIPPED;
		System.out.println(status.getCode());
		for(OrderStatus os : OrderStatus.values()) {
			System.out.println(os);
		}
		System.out.println(status.ordinal()); // numbering from 0
	}
	
}
