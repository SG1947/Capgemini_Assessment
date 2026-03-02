package Week3.Polymorphism.method_overloading;

public class Calculator {
 public static void addition() { //base 1
	 
 }
 public static void addition(double op1,double op2) { // wrt no of arguments comp to base1 
	//base2
}
 public static void addition(float op1,double op2) { // wrt datatype of arguments comp to base2
		//base3
}
 public static void addition(double op1,float op2) { // wrt order of datatypes of arguments comp to base3
		//base4
}
 public static void addition(double op1,char opr,double op2) { // wrt all comp to base4
		//base5
 }
 
 public void add() {
	 System.out.println("No");
 }
 public void add(int x,int y) {
	 System.out.println("Yes");
 }
 public static void main(String[] args) {
	Calculator c= new Calculator();
	c.add();
	c.add(2,3);
}
}
