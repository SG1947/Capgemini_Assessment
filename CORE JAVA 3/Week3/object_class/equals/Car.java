package Week3.object_class.equals;

public class Car {
	int id;
    String colour;
    public Car(int id,String colour) {
    	this.id=id;
    	this.colour=colour;
    }
    @Override
    public boolean equals(Object obj) {
    	// TODO Auto-generated method stub
    	if(this==obj) {
    		System.out.println("Returning from 1st block");
    		return true; // if object references are same 
    	
    	}
    	if(obj==null || this.getClass()!=obj.getClass()) {
//    		System.out.println(getClass());
//    		System.out.println(obj.getClass());
    		System.out.println("Returning from 2nd block");
    		return false; //different types
    	}
    	Car car=(Car)obj;//downcasting 
    	//same type but addresses different 
    	if(this.id==car.id && this.colour==car.colour ) {
    		System.out.println("Returning from 3rd block");
	    return true ;
    	}
    	return false;
    }
}
