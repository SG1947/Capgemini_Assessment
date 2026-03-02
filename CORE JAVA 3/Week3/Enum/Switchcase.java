package Week3.Enum;
enum Status {
NEW, IN_PROGRESS, COMPLETED
}
public class Switchcase {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Status status=Status.NEW;
		switch (status) {
		case NEW:
			System.out.println("Order placed");
			break;
        case IN_PROGRESS:
        	System.out.println("Order processing");
			break;
        case COMPLETED:
        	System.out.println("Order delivered");
	        break;
		default:
			break;
		}

	}

}
