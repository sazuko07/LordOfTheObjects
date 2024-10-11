
	package com.skilldistillery.objectgame.app;
	import com.skilldistillery.objectgame.entities.*;
import com.skilldistillery.objectgame.entities.Character;
	public class GameApp{
		public static void main(String[] args){
			GameApp game = new GameApp();
			game.run();
		}

		public void run() {
			String userChoice = " ";
			HeroFroZone froZone = new HeroFroZone("HeroFroZone", 3, 1, 0);
			BadGuySyndrome syndrome = new BadGuySyndrome("BadGuySyndrome", 3, 1, 3);
			java.util.Scanner scanner = new java.util.Scanner(System.in); 
			System.out.println("Welcome to Riddles & Rogues! The survival game of riddles...");
			System.out.println("You, FroZone, the hero, will be faced with several riddles, and if you ");
			System.out.println("succeed in answering them correctly, will be able to defeat your rival, Syndrome, and ");
			System.out.println("gain the three sacred treasures!");
			System.out.println();
			System.out.println("Would you like to play? Answer yes or no: ");
			userChoice = scanner.nextLine();
			
			if (userChoice.equalsIgnoreCase("yes")) {
				System.out.println("Then let's begin! your trials and tribulations await!");
				System.out.println("Riddles will come with a list of possible answers. Guess correctly, and you strike the bad guy, ");
				System.out.println("dealing damage to him, and securing a piece of the sacred treasure. once you have the three pieces of ");
				System.out.println("the sacred treasure, you win!");
				System.out.println();
				System.out.println("Now here is your first riddle: ");
			}
				else {
					System.out.println("That's a shame. Maybe next time! ");
					scanner.close();
					System.exit(0);
				}
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
				syndrome.loseTreasure();
			}
				else {
					System.out.println("You have answered incorrectly... the villain attacks!");
					syndrome.attack(froZone);
			}
			}
		}
	

