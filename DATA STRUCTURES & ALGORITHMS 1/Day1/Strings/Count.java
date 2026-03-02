package DSA.Day1.Strings;

public class Count {
public static void main(String[] args) {
	String str = "Hello World";
    int count = 0;
    
    for (int i = 0; i < str.length(); i++) {
        if (Character.isLetterOrDigit(str.charAt(i)) || Character.isWhitespace(str.charAt(i)) ) {
            count++;
        }
    }
    System.out.println("Count of characters: " + count);
}
}
