package DSA.Day1;

public class Insert {

	public static void main(String[] args) {
	int arr[]=new int[5];
    arr[0]=10;
    arr[1]=23;
    arr[2]=12;
    arr[3]=31;
    int pos=2;
    int ele=56;
    for (int i = arr.length-1; i >=pos; i--) {
		arr[i]=arr[i-1];
	}
    arr[pos]=ele;
    for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
	}
      
	}

}
