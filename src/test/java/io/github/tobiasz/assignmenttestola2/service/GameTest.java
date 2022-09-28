package io.github.tobiasz.assignmenttestola2.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class GameTest {

	private Game game;

	@BeforeEach
	void setUp() {
		this.game = new Game();
	}

	@Test
	@DisplayName("something")
	void something() throws Exception {
		for (int i = 0; i < 18; i++) {
			this.game.roll(4);
		}
		System.out.println(this.game.score());
		this.game.roll(10);
		this.game.roll(10);
		this.game.roll(10);
		System.out.println(this.game.score());
	}

}