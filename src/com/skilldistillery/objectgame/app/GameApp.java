
package com.skilldistillery.objectgame.app;

import com.skilldistillery.objectgame.entities.*;
import com.skilldistillery.objectgame.entities.Character;

public class GameApp {

	String userChoice = " ";
	HeroFroZone froZone = new HeroFroZone("HeroFroZone", 3, 1, 0);
	BadGuySyndrome syndrome = new BadGuySyndrome("BadGuySyndrome", 3, 1);
	java.util.Scanner scanner = new java.util.Scanner(System.in);
	public int treasure = froZone.checkTreasure(0);

	public static void main(String[] args) {
		GameApp game = new GameApp();
		game.run();
	}

	public void run() {

		System.out.println("Welcome to Riddles & Rogues! The survival game of riddles...");
		System.out.println("You, FroZone, the hero, will be faced with several riddles, and if you ");
		System.out.println("succeed in answering them correctly, will be able to defeat your rival, Syndrome, and ");
		System.out.println("gain the three sacred treasures!");
		System.out.println();
		System.out.println("Would you like to play? Answer yes or no: ");
		userChoice = scanner.nextLine();

		if (userChoice.equalsIgnoreCase("yes")) {
			System.out.println("Then let's begin! your trials and tribulations await!");
			System.out.println(
					"Riddles will come with a list of possible answers. Guess correctly, and you strike the bad guy, ");
			System.out.println(
					"dealing damage to him, and securing a piece of the sacred treasure. once you have the three pieces of ");
			System.out.println("the sacred treasure, you win!");
			System.out.println();
			System.out.println("Now here is your riddle: ");
			riddle1();
			cont1nue();
			riddle2();
			cont1nue();
			riddle3();
			checkForLoss();
			checkForWin();
		} else {
			System.out.println("That's a shame. Maybe next time! ");
			scanner.close();
			System.exit(0);
		}
	}

	public void checkForWin() {
		if (froZone.checkTreasure(treasure) == 3)
			;
		System.out.println("You have assembled all 3 pieces of the sacred treasure! you have defeated");
		System.out.println(" Syndrome and saved Metroville from his tyranny!");
		System.out.println();
		System.out.println("You win!");
		scanner.close();
		System.exit(0);
	}

	public void checkForLoss() {
		if (froZone.getHealth() == 0)
			;
		System.out.println("Despite FroZone's valliant efforts, he has fallen before gaining the three ");
		System.out.println("pieces of the sacred treasure. Villainy has triumphed....");
		System.out.println();
		System.out.println("You lose...");
		scanner.close();
		System.exit(0);
	}

	public void cont1nue() {
		if (userChoice.equalsIgnoreCase("piano") || userChoice.equalsIgnoreCase("Stars")
				|| userChoice.equalsIgnoreCase("Life")) {
			System.out.println("you have won" + froZone.getTreasure()
					+ " treasures so far, but you have yet to collect 3 pieces!");
			System.out.println("your trials and tribulations continue!");
			System.out.println("Here is your next riddle: ");
			System.out.println();
		}

	}

	public void riddle1() {
		System.out.println("What has 88 keys?");
		System.out.println("A) keyboard");
		System.out.println("B) piano");
		System.out.println("C) lockbox");
		System.out.println("D) case");
		System.out.println();
		System.out.println("Please type out your 1-word answer: ");
		userChoice = scanner.nextLine();
		if (userChoice.equalsIgnoreCase("piano")) {
			System.out.println("You are correct! ");
			froZone.attack(syndrome);
			froZone.gainTreasure();
			syndrome.takeDamage(1);
			System.out.println("Syndrom has been weakened! However, he gets back up and continues the game");
			System.out.println("Syndrome has" + syndrome.getHealth() + " health left");
		} else {
			System.out.println("You have answered incorrectly... the villain attacks!");
			syndrome.attack(froZone);
			froZone.takeDamage(1);
			System.out.println("FroZone has" + froZone.getHealth() + " health left");
		}
	}

	public void riddle2() {
		System.out.println(
				"they came at night without being called, and are lost in the day without being stolen. what are they? ");
		System.out.println("A) Dreams");
		System.out.println("B) Mist");
		System.out.println("C) Stars");
		System.out.println("D) Shadows");
		System.out.println();
		System.out.println("Please type your 1-word answer: ");
		userChoice = scanner.nextLine();
		if (userChoice.equalsIgnoreCase("Stars")) {
			System.out.println("You are correct! ");
			froZone.attack(syndrome);
			froZone.gainTreasure();
			syndrome.takeDamage(1);
			System.out.println("Syndrom has been weakened! However, he gets back up and continues the game");
			System.out.println("Syndrome has" + syndrome.getHealth() + " health left");
		} else {
			System.out.println("You have answered incorrectly... the villain attacks!");
			syndrome.attack(froZone);
			froZone.takeDamage(1);
			System.out.println("FroZone has" + froZone.getHealth() + " health left");
		}
	}

	public void riddle3() {
		System.out.println("what can be lost, but never returned?");
		System.out.println("A) life");
		System.out.println("B) time");
		System.out.println("C) trust");
		System.out.println("D) youth");
		System.out.println();
		System.out.println("Please type your 1-word answer: ");
		userChoice = scanner.nextLine();
		if (userChoice.equalsIgnoreCase("life")) {
			System.out.println("You are correct! ");
			froZone.attack(syndrome);
			froZone.gainTreasure();
			syndrome.takeDamage(1);
			System.out.println("Syndrom has been weakened! However, he gets back up and continues the game");
			System.out.println("Syndrome has" + syndrome.getHealth() + " health left");
		} else {
			System.out.println("You have answered incorrectly... the villain attacks!");
			syndrome.attack(froZone);
			froZone.takeDamage(1);
			System.out.println("FroZone has" + froZone.getHealth() + " health left");
		}
	}
}
