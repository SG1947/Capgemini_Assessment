package Week3.Factorymethod;

public class Laptop {
	private static Laptop laptop;
	private Laptop(){
		
	}
    public static Laptop laptopFactory() {
//		Laptop laptop = new Laptop();
//		return laptop;
    	if (laptop==null) {
    		System.out.println("laptop object created ");
    		laptop =new Laptop();
		}
    	else {
    		System.out.println("Previously created laptop object is returned ");
    	}
    	return laptop; 
	}
}
