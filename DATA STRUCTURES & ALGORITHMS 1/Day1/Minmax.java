package DSA.Day1;

public class Minmax {
public static void main(String[] args) {
	int arr[]= {10,20,30,40,50};
	int maxi=arr[0];
	int mini=arr[0];
	for (int i = 1; i < arr.length; i++) {
		if(arr[i]>maxi) {
			maxi=arr[i];
		}
		else if(arr[i]<mini) {
			mini=arr[i];
		}
	}
	System.out.println("Max:"+maxi+" ,Mini:"+mini);
}
}
