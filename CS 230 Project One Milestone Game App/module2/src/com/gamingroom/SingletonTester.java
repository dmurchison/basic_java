package com.gamingroom;

/**
 * A class to test a singleton's behavior
 *
 * @author coce@snhu.edu
 */
public class SingletonTester {

	public void testSingleton() {

		System.out.println("\nAbout to test the singleton...");

		// FIXED MAY21: obtain local reference to the singleton instance
		GameService service = GameService.getInstance(); // obtain singleton instance

		// a simple for loop to print the games
		for (int i = 0; i < service.getGameCount(); i++) {
			System.out.println(service.getGame(i));
		}

	}

}
