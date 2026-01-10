package day_4;

public class Methods {

	public static int sum (int a ,int b) {
		int c= a+b;
		return c;
		
		}
	
		public static float sum(float f1,float f2) {
		float f3 = f1+f2;
		return f3;		
		}
   public static void main(String[]args) {
	   int SumOfIntegerValue=sum(23, 34);
	   System.out.println(SumOfIntegerValue);
	   float SumOfFloatValue=sum(23.56f,45.2f);
	   System.out.println(SumOfFloatValue);
   }
}
