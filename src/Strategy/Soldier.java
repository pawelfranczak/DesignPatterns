package Strategy;
 
public class Soldier extends Person {

	public Soldier(String firstName, String lastName) {
		super(firstName, lastName);
		this.weapon = new WeaponEmpty();
		System.out.println("New " + this);
	}

	WeaponStrategy weapon;
	
	public void setWeapon(WeaponStrategy weapon) {
		System.out.print(this);
		this.weapon = weapon;
		System.out.println(" found " + weapon);
	}
	
	public int attackWithweapon() {
		System.out.print(this + " use: ");
		return weapon.attack();
	}

	@Override
	public String toString() {
		return "Soldier [weapon=" + weapon + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", hp=" + hp + "]";
	}

	
	
}
