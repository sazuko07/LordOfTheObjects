package com.skilldistillery.objectgame.entities;

//class that extends the abstract "character" class
public class HeroFroZone extends Character {
	protected int treasure = 0;

//getters and setters
public int getTreasure() {
	return treasure;
		}

public void setTreasure(int treasure) {
	this.treasure = treasure;
		}

public HeroFroZone(String name, int health, int damage, int treasure) {
super(name, health, damage);	
}



//method for each character to take damage	
	public void takeDamage(int amount) {

		if (this.HP <= 3 && HP != 0) {
		HP--;
		}

	}

	// method to just check the number of "treasures" that Frozone has accumulated
	public int checkTreasure()
	{
		return treasure;
	}

	// method to increment treasure
	public int gainTreasure() {
		if (this.treasure < 3)
			;
		treasure++;
		System.out.println("FroZone has gained a piece of the sacred treasure!");
		return treasure;
	}

	// overridden attack method from "character" class
	@Override
	public void attack(Character BadGuySyndrome) {
		System.out.println("Looks like FroZone has the cure for THIS Syndrome!");
		System.out.println("HeroFroZone is successful! He strikes BadGuySyndrome for 1 point of damage!");
		BadGuySyndrome.takeDamage(1);
	}

}
