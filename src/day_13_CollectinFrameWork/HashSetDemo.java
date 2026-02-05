package day_13_CollectinFrameWork;

import java.util.*;

public class HashSetDemo {
	
	/* Hashset class implements Set Interface.
	 * It does not allow duplicates.
	 * It will not follow the insertion order.
	 * 	
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<>();
		hs.add("Guava");
		hs.add("Banana");
		hs.add("Guava");
		hs.add("1234");
		hs.add("GTY");
	//	System.out.println(hs);
		
		//easiest way
		System.out.println("Using for eash loop:");
			for(String a:hs) {
				System.out.println(a);
			}
			
		//hardest way
			System.out.println("Using Iterator concept:");
			Iterator<String> it=hs.iterator();
					while(it.hasNext()) {
						System.out.println(it.next());
					}
					//Remote-
				hs.remove(1234);
				System.out.println(hs);{
					System.out.println();
				}
			
		}

	}


