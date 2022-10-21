package io.cucumber.shouty;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class StepDefinitions {

    private Person lucy;
    private Person sean;
    private String messageFromSean;

    @Given("Lucy is located {int} metre(s) from Sean")
    public void lucy_is_located_metres_from_sean(final Integer distance) {
        lucy = new Person();
        sean = new Person();
        lucy.moveTo(distance);
    }

    @When("Sean shouts {string}")
    public void sean_shouts(final String message) {
        sean.shout(message);
        messageFromSean = message;
        lucy.hears(message);
    }

    @Then("Lucy hears Sean's message")
    public void lucy_hears_sean_s_message() {
        if (lucy.getMessagesHeard().contains(messageFromSean)){
            lucy.heard(messageFromSean);
        }
    }

    @Then("Lucy should hear Sean's message")
    public void lucy_should_hear_sean_s_message() {
        assertTrue(lucy.getMessagesHeard().contains(messageFromSean));
    }

}
