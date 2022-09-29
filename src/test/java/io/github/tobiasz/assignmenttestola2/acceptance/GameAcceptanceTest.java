package io.github.tobiasz.assignmenttestola2.acceptance;

import static org.assertj.core.api.Assertions.assertThat;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.tobiasz.assignmenttestola2.service.Game;

public class GameAcceptanceTest {

    private Game game;

    @Given("a bowling game")
    public void aBowlingGame() {
        this.game = new Game();
    }

    @When("i roll {int} times and hit {int} each time")
    public void iRollRollsTimesAndHitAmountEachTime(Integer rolls, Integer amount) {
        for (int i = 0; i < rolls; i++) {
            this.game.roll(amount);
        }
    }

    @Then("my final score is {int}")
    public void myFinalScoreIsFinalScore(Integer finalScore) {
        assertThat(this.game.score()).isEqualTo(finalScore);
    }

    @When("i roll a strike")
    public void iRollAStrike() {
        this.game.roll(10);
    }

    @Then("i should be given a bonus for my next two rolls")
    public void iShouldBeGivenABonusForMyNextTwoRolls() {
        this.game.roll(4);
        this.game.roll(4);
        assertThat(this.game.score()).isEqualTo(26);
    }
}
