package Observer;

public class Person implements IObserver {
	
	String firstname;
	String lastname;
	
	public Person(String firstname, String surname) {
		this.firstname = firstname;
		this.lastname = surname;
		System.out.println("Create new oberver: " + this);
	}
	
	@Override
	public String toString() {
		return "Person [firstname=" + firstname + ", lastname=" + lastname + "]";
	}

	@Override
	public void update(Object object) {
		System.out.println(this + " recived new " + object);
	}

}
