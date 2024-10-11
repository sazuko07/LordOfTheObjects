package com.skilldistillery.objectgame.entities;

public abstract class Character {
	private String name;
	protected int HP;
	protected int damage;
	
	
	public Character() {}

	public Character(String name, int health, int damage) {
		this.name = name;
		this.HP = health;
		this.damage = damage;

	}

	// Method to reduce health when taking damage
	public void takeDamage(int damage) {
		this.HP -= damage;
		
		// reduce hp but don't go under 0;
		if (this.HP < 0) {
			this.HP = 0;
		}
	}

	// method to determine if the character is alive
	public boolean isAlive() {
		return this.HP > 0;
	}

	public int getDamage() {
		return this.damage;
	}

	public int getHealth() {
		return this.HP;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHP(int hP) {
		HP = hP;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public void attack(Character target) {
		System.out.println(this.name + " attacks " + target.getName() + " for " + this.damage + " damage!");
		target.takeDamage(this.damage);
	}
}
