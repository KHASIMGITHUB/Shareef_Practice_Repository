package day_3_Operators;

public class BinaryOperator {

	public static void main(String[] args) {
		
		/*
		 * Relational - <,>,
		 * Logical - && ,||,!  -- and,or,not 
		 * Arithematic - + 
		 */
		System.out.println("Arathematic Operator");
		int a=100;
		int b=20;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		System.out.println(a>b);//true
		System.out.println(a==b);//false
		
		int c=12;
		System.out.println(a>b && a>c);// true
		
		System.out.println(a>b && c>b);//true && false- False
		
		
		
				
		
	}
	

}
