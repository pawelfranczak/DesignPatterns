package Strategy;

public class WeaponKnife extends WeaponStrategy {

	public WeaponKnife(int minHit, int maxHit) {
		super(minHit, maxHit, "knife");
	}
	
	@Override
	public int attack() {
		int power = generator.nextInt(maxHit - minHit + 1) + minHit;
		System.out.println("Weapon [stab enemy] with power " + power);
		return power;
	}
	
}
