package io.github.tobiasz.assignmenttestola2.service;

import static org.assertj.core.api.Assertions.assertThat;
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
	@DisplayName("can roll 20 games with 0 score")
	void canRoll20GamesWith0Score() throws Exception {
		this.rollMany(20, 0);
		assertThat(this.game.score()).isEqualTo(0);
	}

	@Test
	@DisplayName("given more rolls than allowed only count the first 20 rolls")
	void givenMoreRollsThanAllowedOnlyCountTheFirst20Rolls() throws Exception {
		this.rollMany(21, 4);
		assertThat(this.game.score()).isEqualTo(80);
	}

	@Test
	@DisplayName("spare will give extra points")
	void spareWillGiveExtraPoints() throws Exception {
		this.game.roll(5);
		this.game.roll(5);
		this.game.roll(4);
		assertThat(this.game.score()).isEqualTo(18);
	}

	@Test
	@DisplayName("strike will give extra points")
	void strikeWillGiveExtraPoints() throws Exception {
		this.game.roll(10);
		this.game.roll(5);
		this.game.roll(4);
		assertThat(this.game.score()).isEqualTo(28);
	}

	private void rollMany(int times, int score) {
		for (int i = 0; i < times; i++) {
			this.game.roll(score);
		}
	}

}