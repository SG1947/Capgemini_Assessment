package Week3.Polymorphism.method_overriding;

public class EmployeeDriver {

	public static void main(String[] args) {
		Employee e = new Employee();
		System.out.println(e.monthlySalCal());
		System.out.println(e.SalCal(1));
        It it = new It();
        System.out.println(it.monthlySalCal());
        System.out.println(it.SalCal(1));
        System.out.println(it.SalCal(1, 3000));
        Supporting sup = new Supporting();
        System.out.println(sup.monthlySalCal());
        System.out.println(sup.SalCal(1));
        System.out.println(sup.SalCal(1, 1000));
	}

}
