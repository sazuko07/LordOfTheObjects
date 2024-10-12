package com.skilldistillery.objectgame.entities;

import java.util.Random;

public class BadGuySyndrome extends Character { 

	Random hitOrMiss = new Random();
	
	
	public void attack(Character frozone) {
		// generates a random true or false giving us 50% chance this hit will be true or false when 
		boolean hit = hitOrMiss.nextBoolean();
		// ran in the if statement 
		
		if (hit) {
			System.out.println(this.getName() + " strikes 1 deal of damage and takes your treasure");
			frozone.takeDamage(1); 

		} else {
			System.out.println("HA YOU MISS " + this.getName());
		
		}
		
	}
	
	public BadGuySyndrome(String name, int health, int damage) {
		super(name, health, damage);
		// TODO Auto-generated constructor stub
		
		
	}
	
}
