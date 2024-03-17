package com.mjkimspring.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mjkimspring.learnspringframework.game.GameRunner;
import com.mjkimspring.learnspringframework.game.GamingConsole;
import com.mjkimspring.learnspringframework.game.PacmanGame;

public class App03GamingSpringBeans {
	public static void main(String[] args) {

		try(var context = 
				new AnnotationConfigApplicationContext
				(GamingConfiguration.class)){
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
			
			
		}






		//		//var game = new MarioGame();
		//		//var game = new SuperContraGame();
		//		var game = new PacmanGame();
		//		var gameRunner = new GameRunner(game);
		//		gameRunner.run();
	}
}
