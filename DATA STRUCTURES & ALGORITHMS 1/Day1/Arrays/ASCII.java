package DSA.Day1.Arrays;

public class ASCII {

	public static void main(String[] args) {
//		21.Given a string, where each character’s ASCII value contributes to the sum, 
//		find the starting index of a substring whose sum equals K
		
		 String s = "abcd";
	        int K = 197; // "bc" = 98 + 99

	        int start = 0, sum = 0;

	        for (int end = 0; end < s.length(); end++) {
	            sum += s.charAt(end); // ASCII value

	            while (sum > K && start <= end) {
	                sum -= s.charAt(start);
	                start++;
	            }

	            if (sum == K) {
	                System.out.println("Starting index: " + start);
	                return;
	            }
	        }

	        System.out.println("No substring found");
	        
	}

}
