package Week3.object_class.to_string;

public class Employee {
     int id;
     String name;
	
	public Employee(int id,String name){
		this.id=id;
		this.name=name;
	}
	@Override
	public String toString() {
		
//		return super.toString();
		return "Employee id :"+this.id+",Employee name:"+this.name;
	}
}
