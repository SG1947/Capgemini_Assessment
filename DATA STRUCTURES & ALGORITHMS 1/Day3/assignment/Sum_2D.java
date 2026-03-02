package DSA.Day3.assignment;

public class Sum_2D {
	public static int add(int [][]arr) {
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum+=arr[i][j];
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		int [][] arr= {{10,20,30},{40,50},{60}};
		int sum=add(arr);
		System.out.println("Sum of the 2D array is :"+sum);
	}


}
