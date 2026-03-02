package DSA.Day3.assignment;

import java.util.Arrays;

public class third_largest {
   
	public static int thirdLargest(int [] arr) {
		int largest=arr[0];
		int second_largest=arr[0];
		int third_largest=arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>largest) {
				third_largest=second_largest;
				second_largest=largest;
				largest=arr[i];
			}
			else if(arr[i]<=largest && arr[i]>second_largest) {
				third_largest=second_largest;
				second_largest=arr[i];
			}
			else if(arr[i]<=second_largest && arr[i]>third_largest) {
				third_largest=arr[i];
			}
		}
    
		return third_largest;
	}
	public static void main(String[] args) {
		int [] arr= {10,30,23,45,41,12,43,40};
		System.out.println("Third largest element is:"+thirdLargest(arr));

	}

}
