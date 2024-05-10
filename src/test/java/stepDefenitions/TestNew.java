package stepDefenitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestNew {
    @Given("an example scenario")
    public void an_example_scenario() {
      System.out.println("its a sunday");
    }
    @When("all step definitions are implemented")
    public void all_step_definitions_are_implemented() {
        System.out.println("its a tuesday");
    }
    @Then("the scenario passes")
    public void the_scenario_passes() {
        System.out.println("its a saturday");
    }
    @Given("today is {string}")
    public void today_is(String string) {
        System.out.println("its a "+string);
    }
    @When("I ask whether it's Friday yet")
    public void i_ask_whether_it_s_friday_yet() {
        System.out.println("its a sunday");
    }
    @Then("I should be told {string}")
    public void i_should_be_told(String string) {
        System.out.println("its a "+string);
    }

}
