
package com.skilldistillery.objectgame.app;

import com.skilldistillery.objectgame.entities.*;

public class GameApp {
//global variables and instances of the characters used
	String userChoice = " ";
	HeroFroZone froZone = new HeroFroZone("HeroFroZone", 3, 1, 0);
	BadGuySyndrome syndrome = new BadGuySyndrome("BadGuySyndrome", 3, 1);
	java.util.Scanner scanner = new java.util.Scanner(System.in);
	

//main static method that starts running the program
	public static void main(String[] args) {
		GameApp game = new GameApp();
		game.run();
	}

//main program body to run the game. the game is of linear design
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
			System.out.println("Now here is your first riddle: ");
			riddle1();
//			cont1nue();
			riddle2();
//			cont1nue();
			riddle3();
			checkForWinOrLose();
			continueToGainTreasure();
		} else {
			System.out.println("That's a shame. Maybe next time! ");
			scanner.close();
			System.exit(0);
		}
	}

//method to check to see if the player has lost the game, or has won
	public void checkForWinOrLose() {
		if (froZone.checkTreasure() == 3 && syndrome.getHealth() == 0) {
			System.out.println("You have assembled all 3 pieces of the sacred treasure! you have defeated");
			System.out.println(" Syndrome and saved Metroville from his tyranny!");
			System.out.println();
			System.out.println("You win!");
			scanner.close();
			System.exit(0);
		}
	
		else if  
			(froZone.getHealth() == 0) {
			System.out.println("Despite their valliant effort, froZone has fallen in the defense of Metroville...");
			System.out.println();
			System.out.println("You lose...");
			scanner.close();
			System.exit(0);
		}
	}



//method to continue through to the next riddle if the correct answer is given
//	public void cont1nue() {
//		if (froZone.getTreasure() < 3 || froZone.getHealth() > 0 || syndrome.getHealth() > 0) {
//			System.out.println("you have won " + froZone.getTreasure()
//					+ " treasures so far, but you have yet to collect 3 pieces!");
//			System.out.println("your trials and tribulations continue!");
//			System.out.println("Here is your next riddle: ");
//			System.out.println();
//		}
//		else {
//			checkForWinOrLose();
//		}
//	}
	
//method for the first riddle
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
			checkForWinOrLose();
			System.out.println("Syndrome has " + syndrome.getHealth() + " health left");
		} else {
			System.out.println("You have answered incorrectly... the villain attacks!");
			syndrome.attack(froZone);
			System.out.println("FroZone has " + froZone.getHealth() + " health left");
			checkForWinOrLose();
		}
		
	}

//method for the second riddle
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
			checkForWinOrLose();
			System.out.println("Syndrome has " + syndrome.getHealth() + " health left");
		} else {
			System.out.println("You have answered incorrectly... the villain attacks!");
			syndrome.attack(froZone);
			System.out.println("FroZone has " + froZone.getHealth() + " health left");
			checkForWinOrLose();
		}
		
	}

//method for the third riddle
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
			checkForWinOrLose();
			System.out.println("Syndrome has " + syndrome.getHealth() + " health left");
		} else {
			System.out.println("You have answered incorrectly... the villain attacks!");
			syndrome.attack(froZone);
			System.out.println("FroZone has " + froZone.getHealth() + " health left");
			checkForWinOrLose();
		}
		
	}
	

//method to loop through the game again, after attempting all 3 riddles, if the player hasnt gained all 3 pieces of treasure
	public void continueToGainTreasure() {
		if (froZone.checkTreasure() != 3 && syndrome.getHealth() != 0) {
		System.out.println("You still havent gathered the 3 pieces of the sacred treasure. If Metroville is to ");
		System.out.println("stand a chance against Syndrome, you must continue your quest!");
		riddle1();
//		cont1nue();
		riddle2();
//		cont1nue();
		riddle3();
		checkForWinOrLose();
	}
		else {
			checkForWinOrLose();
		}
	}
}