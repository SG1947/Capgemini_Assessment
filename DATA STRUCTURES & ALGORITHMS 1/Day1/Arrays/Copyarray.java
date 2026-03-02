package DSA.Day1.Arrays;

public class Copyarray {

	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 51};
		int n = arr.length;
		int[] copy = new int[n];

		for (int i = 0; i < n; i++) {
		    copy[i] = arr[i];
		}
		for (int i = 0; i < copy.length; i++) {
			System.out.println(copy[i]);
		}
	}

}
