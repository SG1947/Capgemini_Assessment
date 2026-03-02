package Week3.Polymorphism.Var_hiding;

public class Test {

	public static void main(String[] args) {
		Parent p =new Child();
		System.out.println(p.x);
		System.out.println(p.y);
		Child c= (Child) p;
//		Child c  new Child();
		System.out.println(c.x);
		System.out.println(c.y);

	}

}
