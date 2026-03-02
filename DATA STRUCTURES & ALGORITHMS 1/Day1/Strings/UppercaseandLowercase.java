package DSA.Day1.Strings;

public class UppercaseandLowercase {

	public static void main(String[] args) {
		StringBuilder s = new StringBuilder("Hello World2");
		for (int i = 0; i < s.length(); i++) {
			
			char ch=s.charAt(i);
		
//			if(ch>='a' && ch<='z') {
//				s.setCharAt(i, (char) (ch-32));;
//			
//			}
			if(ch>='A' && ch<='Z') {
				s.setCharAt(i, (char) (ch+32));;
			
			}
//			s.deleteCharAt(i)
			
		}
//		System.out.println(s.toUpperCase());
//		System.out.println(s.toLowerCase());
		System.out.println(s);
	}

}
