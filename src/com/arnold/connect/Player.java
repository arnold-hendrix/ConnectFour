package com.arnold.connect;

import java.util.Scanner;

public class Player {
	private String name;
	private String playerNumber;

	private static Scanner scanner = new Scanner(System.in);

	public Player(String name, String playerNumber) {
		this.name = name;
		this.playerNumber = playerNumber;
	}

	public String getName() {
		return name;
	}

	public String getPlayerNumber() {
		return playerNumber;
	}

	public int makeMove() {
		System.out.println("Select a column for your token: ");
		int column = scanner.nextInt();
		return column;
	}

	@Override
	public String toString() {
		return "Player " + playerNumber + " is " + name;
	}

}