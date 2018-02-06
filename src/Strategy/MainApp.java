package Strategy;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MainApp {
	
	static List<WeaponStrategy> weapons = Arrays.asList(
			new WeaponKnife(2, 5),
			new WeaponKnife(1, 6),
			new WeaponKnife(3, 7),
			new WeaponKnife(6, 9),
			new WeaponKnife(10, 10),
			new WeaponKnife(1, 2),
			new WeaponGun(11, 32),
			new WeaponGun(7, 19),
			new WeaponGun(21, 25),
			new WeaponGun(11, 15),
			new WeaponGun(25, 29),
			new WeaponGun(15, 35),
			new WeaponRifle(50, 60)
		);

	public static void main(String[] args) {
		Random generator = new Random();
		
		Soldier soldier1 = new Soldier("John", "Rambo");
		Soldier soldier2 = new Soldier("Duglas", "Quaid");
		
		System.out.println("-");
		
		int round = 1;
		while (soldier1.getHP() > 0 && soldier2.getHP() > 0) {
			System.out.println("Round " + round++);
			soldier1.setWeapon(weapons.get(generator.nextInt(weapons.size())));
			soldier2.setWeapon(weapons.get(generator.nextInt(weapons.size())));
			int attack1 = soldier1.attackWithweapon();
			int attack2 = soldier2.attackWithweapon();
			soldier1.setHP(soldier1.getHP() - attack2);
			soldier2.setHP(soldier2.getHP() - attack1);
			System.out.println(soldier1);
			System.out.println(soldier2);
			System.out.println();
		}
		
		
		if (soldier1.getHP() > 0 && soldier2.getHP() <= 0) {
			System.out.println("Winner " + soldier1);
		} else if (soldier1.getHP() <= 0 && soldier2.getHP() > 0) {
			System.out.println("Winner " + soldier2);
		} else {
			System.out.println("DRAW");
		}
		
	}
	
}
