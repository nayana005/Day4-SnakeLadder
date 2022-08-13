package com.bl.snake_ladder;

public class SnakeLadder {
	public static void main(String[] args) {
		
		System.out.println("Welcome to the game of Snake and ladder ");
		
		int position = 0;
		final int DICE_START_RANGE = 1;
		final int DICE_END_RANGE = 6 - DICE_START_RANGE;

		System.out.println("Your current position is :" + position);
		
		int diceNumber = (int) Math.floor(Math.random() * DICE_END_RANGE) + DICE_START_RANGE;
		System.out.println("You have got a Dice number of : "+ diceNumber);

	}
}
