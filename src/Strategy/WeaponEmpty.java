package Strategy;

public class WeaponEmpty extends WeaponStrategy {

	public WeaponEmpty() {
		super(0, 0, "No weapon");
	}
	
	@Override
	public int attack() {
		int power = 0;
		System.out.println("Weapon [shoot enemy] with power " + power);
		return power;
	}


}
