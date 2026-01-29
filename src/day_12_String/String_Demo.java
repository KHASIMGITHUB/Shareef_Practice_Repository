package day_12_String;

public class String_Demo {

	String str1="Hello World"; // Global Variable
	
	public static void main(String[] args) {
		// String - Hello -Non premitive data type
	   //  non premitive data types
	 // Immutable - We can't change the value directly
		
		String s1="Java";
		String s2="Python";
		String s3="java";
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		
		String sn1=new String("Coffee");
		String sn2=new String("Tea");
		String sn3=new String("Coffee");
		System.out.println(sn1==sn2);
		System.out.println(sn1==sn3);
		
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s1.equals(s3));
		
		String Str="Hello";
		Str=Str.concat(" World");
		System.out.println(Str);
		
		String Str1 = "Selenium with Java";
		System.out.println(Str1.charAt(2));
		System.out.println(Str1.contains("Python")); 
		System.out.println(Str1.contains("with")); 
		System.out.println(Str1.startsWith("Sel"));
		System.out.println(Str1.startsWith("With"));//false
		System.out.println(Str1.replace('i', '2'));
		System.out.println(Str1.indexOf('l'));
				
		String Str2="";
		String Str3=" ";
		System.out.println(Str2.isEmpty());//" "	
		System.out.println(Str3.isBlank()); //""
		
		System.out.println(Str1.length());// Length of string
		
		//StringBuffer - is mutable
		StringBuffer Sb=new StringBuffer("Hello");
		Sb.append(" World");
		System.out.println(Sb);
		System.out.println(Sb.reverse());
		
		//Reverse the string :"Selenium"- other than using StringBugger
		String Original="Selenium";
		int LengthOfStr=Original.length();
		String Reverse="";
		for(int i=LengthOfStr-1;i>=0;i--) {
			Reverse = Reverse+Original.charAt(i);
		}
       System.out.println("ReverseOfTheString:"+Reverse);
  
	}

}
