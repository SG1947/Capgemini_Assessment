package DSA.Day1.Strings;

public class Numberofwords {

	public static void main(String[] args) {
		//Number of words
		String str="Hello World how are you";
		boolean word=false;
		int count=0;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)!=' ' && !word) {
					count++;
					word=true;
				}
			else if(str.charAt(i)==' ') {
					word=false;
				}
			
		}
		System.out.println(count);
		

	}

}
