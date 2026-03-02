package DSA.Day1.Arrays;

public class EvenOdd {
public static void main(String[] args) {
	int[] arr = {10, 20, 30, 40, 51};
	int n = arr.length;
	int even = 0, odd = 0;
	for (int i = 0; i < n; i++) {
	    if (arr[i] % 2 == 0)
	        even++;
	    else
	        odd++;
	}
	System.out.println("Even = " + even);
	System.out.println("Odd = " + odd);
}
}
