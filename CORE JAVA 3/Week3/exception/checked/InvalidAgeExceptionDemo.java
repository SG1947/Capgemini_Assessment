package Week3.exception.checked;
enum Permit{
	SOFT,HARD
}
class randomException extends Exception{

	public randomException(String message) {
		super(message);
	}
	
}
public class InvalidAgeExceptionDemo {
//    public static Permit validateAge(int age ) throws InvalidAgeException{
    public static void validateAge(int age ) throws InvalidAgeException,randomException{
		if(age<18) {
			throw new InvalidAgeException("Age must be 18 or older to drink"); //creating object and throwing exception
		}
		else if(age>=18 && age<21) {
			System.out.println("You can have "+Permit.SOFT+" drinks");
			throw new randomException("Random exception");
//			return Permit.SOFT;
		}
		else {
			System.out.println("You can have "+ Permit.HARD +" drinks");
//			return Permit.HARD;
		}
	}
	public static void main(String[] args) {
//		validateAge(16); //checked exception
		try {
			validateAge(20);
		} catch (InvalidAgeException | randomException e ) {
			System.out.println(e.getMessage());
		}
		
	}

}
