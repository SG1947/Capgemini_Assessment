package DSA.Day1;

public class DeletePos {

	public static void main(String[] args) {
		int arr[]=new int[5];
	    arr[0]=10;
	    arr[1]=23;
	    arr[2]=12;
	    arr[3]=31;
	    arr[4]=62;
	    int pos=2;
	    for (int i = pos; i <arr.length-1; i++) {
			arr[i]=arr[i+1];
		}
	    arr[arr.length-1]=0;
	    for (int i = 0; i < arr.length-1; i++) {
			System.out.println(arr[i]);
		}

	}

}
