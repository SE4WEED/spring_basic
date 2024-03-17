package com.mjkimspring.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mjkimspring.learnspringframework.game.GameRunner;
import com.mjkimspring.learnspringframework.game.GamingConsole;
import com.mjkimspring.learnspringframework.game.PacmanGame;

@Configuration
public class GamingConfiguration {
	@Bean
	public GamingConsole game() {
		var game = new PacmanGame();
		return game;
	}
	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		return new GameRunner(game);
	}
}
