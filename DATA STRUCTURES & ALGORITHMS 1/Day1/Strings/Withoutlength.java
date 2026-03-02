package DSA.Day1.Strings;

public class Withoutlength {

	public static void main(String[] args) {
		String s = "Hello World";
		int count =0;
	    char charArray[]=s.toCharArray();
	    for (int i = 0; i < charArray.length; i++) {
			count++;
		}
	    System.out.println(count);
	}

}
