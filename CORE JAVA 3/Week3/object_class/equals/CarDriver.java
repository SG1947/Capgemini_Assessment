package Week3.object_class.equals;

import Week3.object_class.to_string.Employee;

public class CarDriver {

	public static void main(String[] args) {
	Car c1 = new Car(1,"blue");
	Car c2 = new Car(1,"blue");
	Employee e= new Employee(1,"Abcd");
	Car c3=null;
	System.out.println(c1.equals(c1));
	System.out.println(c1.equals(c2)); //comparison on address
	System.out.println(c1.equals(c3));
	System.out.println(c3.equals(c1));
	System.out.println(c1.equals(e));
	}

}
