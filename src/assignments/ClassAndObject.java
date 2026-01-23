package assignments;

public class ClassAndObject {
	
	int beets ;
	public int getBeets() {
		return beets;
	}
	public void setBeets(int beetsCount) {
		beets=beetsCount;
	}
	public static void main(String[] args) {
		
		ClassAndObject c1=new ClassAndObject();
		c1.setBeets(10);
		System.out.println("No of beets are:"+ c1.getBeets() );

	}

}
