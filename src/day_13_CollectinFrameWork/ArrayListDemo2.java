package day_13_CollectinFrameWork;

import java.util.ArrayList;

public class ArrayListDemo2 {
	public static void main (String[] args) {
		ArrayList<Integer> al1 = new ArrayList<>();
		al1.add(12);
		al1.add(23);
		//[12,23]
		
		ArrayList<Integer> al2=new ArrayList<>();
		al2.add(22);
		al2.add(33);
		al2.add(100);
		//[45,50,100]
		//o/p : To print values from al1 and al2
		ArrayList<Integer> result = new ArrayList<Integer>();
		System.out.println(result);
		
		for (int i=0;i<al1.size();i++) {
			result.add(al1.get(i));
			}
		for (int j=0;j<al2.size();j++) {
			result.add(al2.get(j));
			System.out.println(result);
			
		}
		

	
	}	

}
