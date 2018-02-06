package Strategy;

public class WeaponRifle extends WeaponStrategy {

	public WeaponRifle(int minHit, int maxHit) {
		super(minHit, maxHit, "rifle");
	}
	
	@Override
	public int attack() {
		int power = generator.nextInt(maxHit - minHit + 1) + minHit;
		System.out.println("Weapon [shoot enemy with series] with power " + power);
		return power;
	}

}
