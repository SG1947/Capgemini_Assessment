package DSA.Day1.Arrays;

import java.util.HashMap;

public class Sortedornot {
public static void main(String[] args) {
	int[] arr = {10, 20, 40, 40, 51};
	int n = arr.length;
	boolean isSorted = true;

	for (int i = 0; i < n - 1; i++) {
	    if (!(arr[i] <= arr[i + 1])) {
	        isSorted = false;
	        break;
	    }
	}

	if (isSorted)
	    System.out.println("Array is sorted");
	else
	    System.out.println("Array is not sorted");
     
	
	
}
}
