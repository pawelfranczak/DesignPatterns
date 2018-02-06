package Observer;

import java.util.Calendar;

public class MainApp {

	public static void main(String[] args) {
		
		Seller magazineSeller = new Seller("MARVEL", SellerType.MAGAZINE_SELLER);
		Seller musicAlbumsSeller = new Seller("SONY MUSIC", SellerType.MUSIC_ALBUM_SELLER);
		
		System.out.println("-");
		
		IObserver person1 = new Person("John",  "Doe");
		IObserver person2 = new Person("Adam",  "Nowak");
		IObserver person3 = new Person("Nathan",  "Drake");		
		
		System.out.println("-");
		
		magazineSeller.addObserver(person1);
		magazineSeller.addObserver(person2);
		magazineSeller.addObserver(person3);
		musicAlbumsSeller.addObserver(person1);
		musicAlbumsSeller.addObserver(person3);
		
		System.out.println("-");
		
		magazineSeller.sendNewIssue(new Magazine("SpiderMan", Calendar.getInstance().getTime()));
		musicAlbumsSeller.sendNewIssue(new MusicAlbum("Horse The Band", "Desperate Living", "2015"));
		
		System.out.println("-");
		
		magazineSeller.removeObserver(person3);
		
		System.out.println("-");
		
		magazineSeller.sendNewIssue(new Magazine("HULK", Calendar.getInstance().getTime()));
		
	}
	
}
