package com.skilldistillery.objectgame.entities;

public class HeroFroZone extends Character{
	protected int treasure = 0;
	 
	public int getTreasure() {
		return treasure;
	}

	public void setTreasure(int treasure) {
		this.treasure = treasure;
	}

	public HeroFroZone(String name, int health, int damage, int treasure) {
		super(name, health, damage);	
	}
	
	public void takeDamage(int amount) {
		this.HP -= amount;
		if (this.HP < 0) {
			this.HP = 0;
		}
	}
	public int checkTreasure(int treasure) {
		return treasure;
		
	}
	public int gainTreasure() {
		if (this.treasure < 3);
			treasure++;
		System.out.println("FroZone has gained a piece of the sacred treasure!");
		return treasure; 
	}
	
	@Override
	public void attack(Character BadGuySyndrome) {
		System.out.println("Looks like FroZone has the cure for THIS Syndrome!");
		System.out.println("HeroFroZone is successful! He strikes BadGuySyndrome for 1 point of damage!");
		BadGuySyndrome.takeDamage(1);
	}
	
}
