package DSA.Day1;

import java.util.Iterator;

public class Rotate {
	public static void reverse(int start,int end,int[] arr) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

	}
public static void main(String[] args) {
	int arr[]= {10,20,30,40,50};
	int pos=3;
//	int temp[]=new int[arr.length];
	
	
//	for (int i = 0; i < arr.length; i++) {
//		temp[i]=arr[i];
//	}
//	for (int i = 0; i < arr.length; i++) {
//		arr[i]=temp[(i+pos)%arr.length];
//	}
	int n= arr.length;
	reverse(0, n - 1, arr);          // 50 40 30 20 10
    reverse(0, n - pos - 1, arr);    // 40 50 30 20 10
    reverse(n - pos, n - 1, arr);  //40 50 10 20 30
	for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
	}
}
}
