
	package com.skilldistillery.objectgame.app;
	import com.skilldistillery.objectgame.entities.*;
	public class GameApp{
		public static void main(String[] args){
			GameApp game = new GameApp();
			game.run();
		}

		public void run() {
			String userChoice = " ";
			java.util.Scanner scanner = new java.util.Scanner(System.in); 
			System.out.println("Welcome to Riddles & Rogues! The survival game of riddles...");
			System.out.println("You, FroZone, the hero, will be faced with several riddles, and if you ");
			System.out.println("succeed in answering them correctly, will be able to defeat your rival, Syndrome, and ");
			System.out.println("gain the three sacred treasures!");
			System.out.println();
			System.out.println("Would you like to play? Answer yes or no: ");
			userChoice = scanner.nextLine();
		}
	}

