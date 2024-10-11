package com.skilldistillery.objectgame.entities;

public class HeroFroZone extends Character{
	protected int treasure; 
	public HeroFroZone(String name, int health, int damage, int treasure) {
		super(name, health, damage);	
	}
	
	public void takeDamage(int amount) {
		this.HP -= amount;
		if (this.HP < 0) {
			this.HP = 0;
		}
	}
	public void gainTreasure(int treasure) {
		if (this.treasure < 3);
			treasure++;
	}
	
	@Override
	public void attack(Character BadGuySyndrome) {
		System.out.println("Looks like FroZone has the cure for THIS Syndrome!");
		System.out.println("HeroFroZone is successful! He strikes BadGuySyndrome for 1 point of damage!");
		BadGuySyndrome.takeDamage(1);
	}
	
}
