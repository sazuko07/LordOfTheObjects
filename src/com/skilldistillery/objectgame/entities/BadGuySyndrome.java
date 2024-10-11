package com.skilldistillery.objectgame.entities;

import java.util.Random;

public class BadGuySyndrome extends Character { 
	private int treasure;
	
	public void loseTreasure() {
		if (this.treasure > 0) {
			this.treasure--; 
		}
		
		// reduce damage but don't go under zero
		int newDamage = this.getDamage() - 1;
		if(newDamage < 0) {
			newDamage = 0; 
		}
		
		this.setDamage(newDamage);
		
		System.out.println(this.getName() +" loses treasure and now has " + this.treasure + " treasures left!");
		System.out.println(this.getName() + " damage is now " + this.getDamage());
	}
	
	Random hitOrMiss = new Random();
	boolean hit = hitOrMiss.nextBoolean();
	
	public void attack(Character frozone) {
		// generates a random true or false giving us 50% chance this hit will be true or false when 
		// ran in the if statement 
		
		if (hit) {
			System.out.println(this.getName() + " strikes 1 deal of damage and takes your treasure");
			frozone.takeDamage(1); 
			
			// bad guy also loses one treasure
			loseTreasure(); 
		} else {
			System.out.println("HA YOU MISS " + this.getName());
		}
	}

	public BadGuySyndrome(String name, int health, int damage, int treasure) {
		super(name, health, damage);
		// TODO Auto-generated constructor stub
		
		
	}
	
}
