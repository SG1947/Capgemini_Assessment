package Week3.object_class.equals;

public class Temp {

	public static void main(String[] args) {
		String str1="hello";
		String str2=new String("hello");
		String str3="hello";
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));

	}

}
