package DSA.Day3.assignment;

public class Check_pattern {
	public static boolean checkPattern(String str,String pattern) {
		int i=0,j=0;
		while(i<str.length() && j<pattern.length()) {
			if(str.charAt(i)==pattern.charAt(j)) {
				j++;
			}
			i++;
		}
		if(j!=pattern.length()) {
			return false;
		}
	  return true;
	}
	public static void main(String[] args) {
		String str="Hello welcome";
		String pattern="welcome";
		if(checkPattern(str, pattern)) System.out.println("Pattern exists");
		else System.out.println("Pattern does not exist");
		
	}


}
