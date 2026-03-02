package DSA.Day1.Arrays;

import java.util.HashMap;

public class Duplicates {

	public static void main(String[] args) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int[] arr = {10, 20, 40, 40, 51};
		int n = arr.length;
	    for (int num : arr) {
	        map.put(num, map.getOrDefault(num, 0) + 1);
	    }

	    // Print only duplicates
	    System.out.println("Duplicate elements and their count:");
	    for (int key : map.keySet()) {
	        if (map.get(key) > 1) {
	            System.out.println(key + " : " + map.get(key));
	        }
	    }
	}

}
