package DSA.Day1;

public class Deleteele {
	public static void main(String[] args) {

        int[] arr = {10, 31, 1, 12, 31};
        int ele = 31;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != ele) {
                arr[count] = arr[i];
                count++;
            }
        }

        while (count < arr.length) {
            arr[count] = 0;
            count++;
        }
	    for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	   
	}
	
}
