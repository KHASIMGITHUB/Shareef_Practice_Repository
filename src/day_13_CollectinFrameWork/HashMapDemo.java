package day_13_CollectinFrameWork;

import java.util.HashMap;

public class HashMapDemo {
	// Hashmap-Stores the values in the form of keys and values
	//It does not maintain the insertion order
   // We call each item -Pair,Entry,bucket
	// set of entries are called- Entry set
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1, "Guava");
		hm.put(10, "Grapes");
		hm.put(45, "Mango");
		hm.put(23, "Banana");
		hm.put(24, "Apple");
		System.out.println(hm.get(45));

	}

}
