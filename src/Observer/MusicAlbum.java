package Observer;

public class MusicAlbum {

	String artist;
	String title;
	String year;
	
	public MusicAlbum(String artist, String title, String year) {
		this.artist = artist;
		this.title = title;
		this.year = year;
	}

	@Override
	public String toString() {
		return "MusicAlbum [artist=" + artist + ", title=" + title + ", year=" + year + "]";
	}
	
	
	
}
