package Week3.collections;

import java.util.*;


public class Demo {

	public static void main(String[] args) {
		ArrayList<Integer>arr=new ArrayList<>();
		arr.add(1);
		arr.add(2);
		System.out.println(arr);
		arr.add(1, 3);
		System.out.println(arr);
		arr.addAll(arr);
		System.out.println(arr);
		arr.add(6,8);
		System.out.println(arr);
		arr.remove(6);
		System.out.println(arr);
		arr.sort(null);
		System.out.println(arr);
		Iterator<Integer>it=arr.iterator();
		while (it.hasNext()) { //Returns true if the iteration has more elements.
			Integer integer = it.next(); //Returns the next element in the iteration.
			if(integer.equals(1)) {
				it.remove();
			}
			System.out.println(integer);
			
			
		}
		System.out.println(arr);
//		for (int i = 0; i < arr.size(); i++) {
//			System.out.println(arr.get(i));
//		}
//		for (Integer integer : arr) {
//			System.out.println(integer);
//		}
	}

}
