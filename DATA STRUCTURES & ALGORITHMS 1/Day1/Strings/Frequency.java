package DSA.Day1.Strings;

import java.util.HashMap;

public class Frequency {

	public static void main(String[] args) {
		String str="Hello World";
		HashMap<Character,Integer>freq=new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			char ch=str.charAt(i);
			if(!Character.isWhitespace(ch)) {
				freq.put(ch, freq.getOrDefault(ch, 0)+1);
			}
		}
		
         for(char key : freq.keySet()) {
        	 System.out.println("Key:"+key+" Value:"+freq.get(key));
         }
         StringBuilder sb= new StringBuilder("a");
         
	}

}
