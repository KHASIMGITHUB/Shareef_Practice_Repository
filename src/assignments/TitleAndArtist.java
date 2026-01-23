package assignments;

public class TitleAndArtist {
	
	String artist;
	String title;

	public TitleAndArtist(String title,String artist) {
		this.title=title;
		this.artist=artist;
	}
	public String getTitle() {
		return title;
	}
	
	public String getArtist() {
		return artist;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TitleAndArtist t1=new TitleAndArtist("Soul Meets Body","Death Cab for Cutie");
	         System.out.println("Title is : "+ t1.getTitle());
	         System.out.println("Artist is : "+ t1.getArtist());
		

	}	

}
