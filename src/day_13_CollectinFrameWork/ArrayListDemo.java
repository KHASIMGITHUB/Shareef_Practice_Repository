package day_13_CollectinFrameWork;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		/* ArrayList - is a class which implements list interface
		 * -it isTo store mutiple elements
		 * it is internal working is similar to array - Dynamic size
		 * Maintains the incertion order
		 * Duplicate values are allowed in ArrayList
		 * CRUD
		 * Create,
		 * Retrieve(index)
		 * Update -Set
		 * Delete -Remove - method
		 * size()
		 */
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(12);
		al.add(23);
		al.add(46);
		al.add(12);
		System.out.println(al);
		System.out.println(al.get(2));
		System.out.println("Size of the array list is : "  + al.size());
		for (int i=0;i<al.size();i++) {
	    System.out.println(al.get(i));
	    }
		al.set(2, 22);
		System.out.println("Updated Value:" +al.get(2));
		System.out.println(al); // Before removing we are verifying the present values
		al.remove(3);
		System.out.println(al);
		System.out.println(al.indexOf(23)); // to find index of array

	}

}
