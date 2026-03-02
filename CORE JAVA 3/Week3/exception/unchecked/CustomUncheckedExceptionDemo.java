package Week3.exception.unchecked;

public class CustomUncheckedExceptionDemo {
	
    public static void withdraw(double balance,double amount) {
		if(amount>balance) {
			throw new InsufficientBalanceException("Withdrawal amount exceeds the available balance");
		}
		System.out.println("Withdrawal successful.Remaining balance"+ (balance-amount));
	}
	public static void main(String[] args) {
		double balance=5000;
		double withdrawalAmount=6000;
		
		try {
			withdraw(balance,withdrawalAmount);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}

