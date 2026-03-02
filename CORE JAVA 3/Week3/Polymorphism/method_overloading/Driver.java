package Week3.Polymorphism.method_overloading;

public class Driver {
public static void main(String[] args) {
	Parent p=new Parent();
	p.printNum(1.2);
	Child c = new Child();
	c.printNum(1.2); //inherited
	c.printNum(1.1,2.1); //overloaded
}
}
