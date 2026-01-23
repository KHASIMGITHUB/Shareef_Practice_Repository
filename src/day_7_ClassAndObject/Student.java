package day_7_ClassAndObject;

public class Student {


		// TODO Auto-generated method stub
		//properties -variables and behaviour -methods
		//name,id,pancard,section,grade
		String name;
		int id ;
		String pancard;
		char grade;
		char section;

		
		public void attendSession() {
			System.out.println("Student attends Session");
		}
		
		public void submitProject() {
			System.out.println("Student submits project");
		}
	  
		public static void main(String[] args) {
			Student s1=new Student();
			s1.name="ram";
			s1.id=123;
			s1.grade='1';
			s1.section='A';
			s1.pancard="abdcd1234";
			System.out.println(s1.name);
			s1.attendSession();
			s1.submitProject();
			
			Student s2=new Student();
			s2.name="venkat";
			s2.id=569;
			s2.grade='2';
			s2.section='B';
			s2.pancard="mnor5896";
			System.out.println(s2.name);
			s2.attendSession();
			s2.submitProject();
			
		}
		
		
	}



