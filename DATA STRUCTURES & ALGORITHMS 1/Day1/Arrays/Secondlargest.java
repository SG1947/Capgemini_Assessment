package DSA.Day1.Arrays;

public class Secondlargest {

	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 51};
		int n = arr.length;
		int largest=arr[0];
		int secondLargest=arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]>largest) {
				secondLargest=largest;
				largest=arr[i];
			}
			else if (arr[i] > secondLargest && arr[i] <= largest) {
		        secondLargest = arr[i];
		    }
			
		}
		System.out.println("Second Largest = " + secondLargest);
		int start = 0, end = n - 1;

		while (start < end) {
		    int temp = arr[start];
		    arr[start] = arr[end];
		    arr[end] = temp;

		    start++;
		    end--;
		}
		for (int i = 0; i < n; i++) {
		    System.out.println(arr[i] + " ");
		}
       
        
	}

}
