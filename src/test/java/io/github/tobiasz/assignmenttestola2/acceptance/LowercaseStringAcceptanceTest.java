package io.github.tobiasz.assignmenttestola2.acceptance;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

public class LowercaseStringAcceptanceTest {

    @Autowired
    private MockMvc mvc;
    private String actual;

    @Given("that i want to lowercase a string")
    public void thatIWantToLowercaseAString() {
    }

    @When("the uppercase string is {string}")
    public void theUppercaseStringIs(String input) throws Exception {
        this.actual = this.mvc.perform(get("/string/lowercase").queryParam("string", input))
            .andReturn()
            .getResponse()
            .getContentAsString();
    }

    @Then("the lowercased string is {string}")
    public void theLowercasedStringIs(String expected) {
        assertThat(actual).isEqualTo(expected);
    }
}
