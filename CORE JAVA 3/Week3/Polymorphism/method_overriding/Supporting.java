package Week3.Polymorphism.method_overriding;

public class Supporting extends Employee{
	double varPay=100000;
	public double monthlySalCal() { //overriding
		return ((basePay+varPay)/12);
	}
	public double SalCal(int months,double bonus) { //overloading
		return ((basePay+varPay)/12)*months + bonus;
	  }
	
}
