package DSA.Day1.Arrays;

public class ASCII2 {

	public static void main(String[] args) {
//        22.Given a lowercase string where a=1, b=2, … z=26, 
//		find the starting index of a substring whose sum is K.
String s = "abcd";
int K = 5; // "bc" = 2+3

int start = 0, sum = 0;

for (int end = 0; end < s.length(); end++) {
    sum += (s.charAt(end)-'a'+1); // ASCII value

    while (sum > K && start <= end) {
        sum -= (s.charAt(start)-'a'+1);
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
