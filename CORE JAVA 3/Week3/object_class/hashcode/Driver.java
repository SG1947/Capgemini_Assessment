package Week3.object_class.hashcode;

public class Driver {

	public static void main(String[] args) {
		PetAnimal pa = new PetAnimal("Dog",1);
		PetAnimal pa1 = new PetAnimal("Dog",1);
		System.out.println(pa);
		System.out.println(pa.hashCode()==pa1.hashCode());

	}

}
