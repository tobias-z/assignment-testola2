package io.github.tobiasz.assignmenttestola2.acceptance;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

public class UppercaseStringAcceptance {

    @Autowired
    private MockMvc mvc;
    private String actual;

    @Given("that i want to uppercase a string")
    public void thatIWantToUppercaseAString() {
    }

    @When("the lowercase string is {string}")
    public void theLowercaseStringIs(String input) throws Exception {
        this.actual = this.mvc.perform(get("/string/uppercase").queryParam("string", input))
            .andReturn()
            .getResponse()
            .getContentAsString();
    }

    @Then("the uppercased string is {string}")
    public void theUppercasedStringIs(String expected) {
        assertThat(actual).isEqualTo(expected);
    }
}
