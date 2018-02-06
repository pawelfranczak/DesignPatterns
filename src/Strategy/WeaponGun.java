package Strategy;

public class WeaponGun extends WeaponStrategy {

	public WeaponGun(int minHit, int maxHit) {
		super(minHit, maxHit, "gun");
	}
	
	@Override
	public int attack() {
		int power = generator.nextInt(maxHit - minHit + 1) + minHit;
		System.out.println("Weapon [shoot enemy] with power " + power);
		return power;
	}

}
