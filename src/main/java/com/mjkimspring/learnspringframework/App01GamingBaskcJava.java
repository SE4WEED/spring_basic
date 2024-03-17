package com.mjkimspring.learnspringframework;

import com.mjkimspring.learnspringframework.game.GameRunner;
import com.mjkimspring.learnspringframework.game.PacmanGame;

public class App01GamingBaskcJava {
	public static void main(String[] args) {
		
		
		
		//var game = new MarioGame();
		//var game = new SuperContraGame();
		var game = new PacmanGame();
		var gameRunner = new GameRunner(game);
		gameRunner.run();
	}
}
