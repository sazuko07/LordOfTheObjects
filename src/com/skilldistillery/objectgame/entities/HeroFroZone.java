package com.skilldistillery.objectgame.entities;

//class that extends the abstract "character" class
public class HeroFroZone extends Character {
	protected int treasure = 0;
	private String name;
	private int health;
	private int damage;
	
//getters and setters
public int getTreasure() {
	return treasure;
		}

public void setTreasure(int treasure) {
	this.treasure = treasure;
		}
public String getName() {
	return name;
	}
public void setName(String name) {
	this.name = name;
	}
public int getHealth() {
	return health;
	}
public void setHealth(int health) {
	this.health = health;
	}
public int getDamage() {
	return damage;
	}
public void setDamage(int damage) {
	this.damage = damage;
	}
//type of "character"
public HeroFroZone(String name, int health, int damage, int treasure) {
super(name, health, damage);	
}



	
	public void takeDamage(int amount) {
		this.HP -= amount;
		if (this.HP <= 3 && HP != 0) {
		HP--;
		}

	}

	// method to just check the number of "treasures" that Frozone has accumulated
	public int checkTreasure(int treasure) {
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
