package Week3.Polymorphism.Var_shadowing;

//Local variable over shadowing Instance variable 
public class Demo {
    int x=10;
    static int y=30;
    public void show() { 
    	int x=20; // shadows instance variable 
    	int y=40;
    	System.out.println(x); //20
    	System.out.println(this.x); //10
    	System.out.println(y); //40
    	System.out.println(this.y); //30
    	System.out.println(Demo.y); //30
    }
    public static void main(String[] args) {
    	Demo v=new Demo();
	v.show();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}

