package io.github.tobiasz.assignmenttestola2.acceptance;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

public class ReverseStringAcceptance {

    @Autowired
    private MockMvc mvc;
    private String actual;

    @Given("that i want to reverse a string")
    public void thatIWantToReverseAString() {
    }

    @When("the string is {string}")
    public void theStringIs(String input) throws Exception {
        this.actual = this.mvc.perform(get("/string/reverse").queryParam("string", input))
            .andReturn()
            .getResponse()
            .getContentAsString();
    }

    @Then("the reversed string is {string}")
    public void theReversedStringIs(String expected) {
        assertThat(this.actual).isEqualTo(expected);
    }
}
