package DSA.Day1.Arrays;

public class Linearsearch {
public static void main(String[] args) {
	int[] arr = {10, 20, 30, 40, 51};
	int n = arr.length;
	int key = 30;
	boolean found = false;

	for (int i = 0; i < n; i++) {
	    if (arr[i] == key) {
	        System.out.println("Element found at index " + i);
	        found = true;
	        break;
	    }
	}

	if (!found)
	    System.out.println("Element not found");
	
}
}
