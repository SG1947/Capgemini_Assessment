package Week3.Wrapper;

public class Demo {

	public static void main(String[] args) {
		byte b=7;
		System.out.println(b);
		//Wrapping/Autoboxing
		Byte b1=b;
		System.out.println(b1);
		//Unwrapping/unboxing
        byte b2=b1;
        System.out.println(b2);
        String bStr="7";
        System.out.println(bStr.getClass());
        //Parsing using constructor
        Byte b3 = new Byte(bStr);
        System.out.println(b3);
        System.out.println(b3.getClass());
        
        //Using parseByte
        byte b4=Byte.parseByte(bStr);
        System.out.println(b4);
	}

}
