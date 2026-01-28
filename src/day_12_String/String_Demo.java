package day_12_String;

public class String_Demo {

	String str1="Hello World"; // Global Variable
	
	public static void main(String[] args) {
		// String - Hello -Non premitive data type
	   //  non premitive data types
	 // Immutable - We cant change the value
		
		String s1="Java";
		String s2="Python";
		String s3="Java";
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		
		String sn1=new String("Coffee");
		String sn2=new String("Tea");
		String sn3=new String("Coffee");
		System.out.println(sn1==sn2);
		System.out.println(sn1==sn3);
		
		
		String Str="Hello";
		Str=Str.concat(" World");
		System.out.println(Str);
		
			

	}

}
