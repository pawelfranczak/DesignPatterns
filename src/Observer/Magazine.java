package Observer;

import java.util.Date;

public class Magazine {

	String title;
	Date date;
	
	public Magazine(String title, Date date) {
		this.title = title;
		this.date = date;
	}

	@Override
	public String toString() {
		return "Magazine [title=" + title + ", date=" + date + "]";
	}
	
}
