package Strategy;

import java.util.Random;

public abstract class WeaponStrategy {

	int minHit;
	int maxHit;
	String name;

	public WeaponStrategy(int minHit, int maxHit, String name) {
		this.minHit = minHit;
		this.maxHit = maxHit;
		this.name = name;
	}

	Random generator = new Random();

	public abstract int attack();

	@Override
	public String toString() {
		return "Weapon [minHit=" + minHit + ", maxHit=" + maxHit + ", name=" + name + "]";
	}

}
