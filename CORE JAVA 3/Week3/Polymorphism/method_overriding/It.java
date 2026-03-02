package Week3.Polymorphism.method_overriding;

public class It extends Employee{
	double varPay=200000;
	@Override
	public double monthlySalCal() {//overriding
		return ((basePay+varPay)/12);
	}
//	@Override
//	public int monthlySalCal() {
//		return ((basePay+varPay)/12);
//	}
	public double SalCal(int months,double bonus) {//overloading
		  return ((basePay+varPay)/12)*months + bonus;
	  }
}
