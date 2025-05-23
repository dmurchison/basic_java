package com.gamingroom;

import java.util.ArrayList;
import java.util.List;

/**
 * A singleton service for the game engine
 *
 * @author coce@snhu.edu
 */
public class GameService {

	/**
	 * A list of the active games
	 */
	private static List<Game> games = new ArrayList<Game>();

	/*
	 * Holds the next game identifier
	 */
	private static long nextGameId = 1;

	// FIXED MAY21: Add missing pieces to turn this class a singleton
	// A private static instance of GameService (singleton instance)
    private static GameService instance;
	// Private constructor to prevent instantiation
    private GameService() {
    }
	// Public method to provide access to the singleton instance
    public static GameService getInstance() {
        if (instance == null) {
            instance = new GameService();
        }
        return instance;
    }

	/**
	 * Construct a new game instance
	 *
	 * @param name the unique name of the game
	 * @return the game instance (new or existing)
	 */
	public Game addGame(String name) {

		// a local game instance
		Game game = null;

		// FIXED MAY21: Use iterator to look for existing game with the same name
		// Use iterator to look for existing game with the same name
		for (Game existingGame : games) {
			if (existingGame.getName().equals(name)) {
				game = existingGame;
				break; // Exit the loop once the game is found
			}
		}

		// if not found, make a new game instance and add to list of games
		if (game == null) {
			game = new Game(nextGameId++, name);
			games.add(game);
		}

		// return the new/existing game instance to the caller
		return game;
	}

	/**
	 * Returns the game instance at the specified index.
	 * <p>
	 * Scope is package/local for testing purposes.
	 * </p>
	 * @param index index position in the list to return
	 * @return requested game instance
	 */
	Game getGame(int index) {
		return games.get(index);
	}

	/**
	 * Returns the game instance with the specified id.
	 *
	 * @param id unique identifier of game to search for
	 * @return requested game instance
	 */
	public Game getGame(long id) {

		// a local game instance
		Game game = null;

		// FIXED MAY21: Use iterator to look for existing game with same id
			// if found, simply assign that instance to the local variable
		// Use iterator to look for existing game with the same id
		for (Game existingGame : games) {
			if (existingGame.getId() == id) {
				game = existingGame;
				break; // Exit the loop once the game is found
			}
		}


		return game;
	}

	/**
	 * Returns the game instance with the specified name.
	 *
	 * @param name unique name of game to search for
	 * @return requested game instance
	 */
	public Game getGame(String name) {

		// a local game instance
		Game game = null;

		// FIXED MAY21: Use iterator to look for existing game with same name
			// if found, simply assign that instance to the local variable
		// Use iterator to look for existing game with the same name
		for (Game existingGame : games) {
			if (existingGame.getName().equals(name)) {
				game = existingGame;
				break; // Exit the loop once the game is found
			}
		}


		return game;
	}

	/**
	 * Returns the number of games currently active
	 *
	 * @return the number of games currently active
	 */
	public int getGameCount() {
		return games.size();
	}
}
