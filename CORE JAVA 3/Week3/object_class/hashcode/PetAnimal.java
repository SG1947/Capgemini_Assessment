package Week3.object_class.hashcode;

import java.util.Objects;

public class PetAnimal {
	String name;
    int count;
    public PetAnimal(String name, int count) {
		this.name = name;
		this.count = count;
	}
    @Override
    public int hashCode() {
    	
    	return super.hashCode();
//    	return Objects.hash(name,count);
    }
	 
     
}
