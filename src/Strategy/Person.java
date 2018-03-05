package Strategy;

public abstract class Person {

	String firstName;
	String lastName;
	int hp = 100;
	
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName
				+ "]";
	}
	
	public int getHP() {
		return hp;
	}
	
	public void setHP(int life) {
		this.hp = life;
	}
	
	public boolean isAlive() {
		return hp > 0;
	}
	
	public boolean isDead() {
		return hp <= 0;
	}
	
}
