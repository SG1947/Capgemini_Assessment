package Week3.Enum;
enum Day{
	MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
}
//enum Status {
//PENDING, APPROVED, REJECTED
//}
enum Direction {
NORTH, SOUTH, EAST, WEST
}
public class Basics {
	public static void main(String[] args) {
		 Day day = Day.MONDAY;
//		 Status status = Status.PENDING;
		 Direction d = Direction.NORTH;
		 
		 System.out.println(day);
//		 System.out.println(status);
		 
		 System.out.println(d);
	}
    
     
}
