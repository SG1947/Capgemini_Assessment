package Week3.exception.unchecked;

class InsufficientBalanceException extends RuntimeException{


	public InsufficientBalanceException(String message) {
		super(message);
	}
     
}
