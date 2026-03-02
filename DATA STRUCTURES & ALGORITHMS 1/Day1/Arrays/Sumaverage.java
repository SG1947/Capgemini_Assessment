package DSA.Day1.Arrays;

public class Sumaverage {

	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 51};
		int n = arr.length;
		int sum = 0;

		for (int i = 0; i < n; i++) {
		    sum += arr[i];
		}
        System.out.println("Sum : " + sum);
		double avg = (double) sum / n;
		System.out.println("Average : " + avg);
	}

}
