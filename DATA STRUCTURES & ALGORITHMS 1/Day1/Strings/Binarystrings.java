package DSA.Day1.Strings;

public class Binarystrings {

	public static void main(String[] args) {
				String s = "101010";
				boolean isBinary = true;

				for (int i = 0; i < s.length(); i++) {
				    if (s.charAt(i) != '0' && s.charAt(i) != '1') {
				        isBinary = false;
				        break;
				    }
				}

				if (isBinary)
				    System.out.println("Binary string");
				else
				    System.out.println("Not a binary string");
	}

}
