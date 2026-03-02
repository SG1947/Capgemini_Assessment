package Week3.Polymorphism.method_overriding;

public class Employee {
  double basePay=300000;
  public double monthlySalCal() {
	return basePay/12;
}
  public double SalCal(int months) {
	  return (basePay/12)*months;
  }
  
  
}
