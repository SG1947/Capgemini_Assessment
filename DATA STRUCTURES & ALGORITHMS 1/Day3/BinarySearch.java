package DSA.Day3;

public class BinarySearch {
	public static int binarySearch(int[] arr, int l, int r, int x) {
        if (l > r) return -1;
        int mid = r+(l-r)/2;

        if (arr[mid] == x) return mid;
        else if (arr[mid] > x)
            return binarySearch(arr, l, mid - 1, x);
        else
            return binarySearch(arr, mid + 1, r, x);
    }
	public static void main(String[] args) {
		int [] arr= {12,34,56,67,89};
		int n=arr.length;
		int ele=34;
		System.out.println(binarySearch(arr,0,n-1,ele));
	}
}
