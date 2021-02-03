package Stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserReg2SD {


    @Given("^I am on another user registration page$")
    public void i_am_on_another_user_registration_page() throws Throwable {
        System.out.println("I am on another user registration page");
    }

    @When("^I enter (.+) , (.+) ,(.+)$")
    public void i_enter_(String firstname, String lastname, String email) throws Throwable {
        System.out.println("FirstName:"+firstname);
        System.out.println("LastName:"+lastname);
        System.out.println("email:"+email);
    }

    @Then("^Record Should be inserted$")
    public void record_should_be_inserted() throws Throwable {
        System.out.println("Record Should be inserted");
    }

    @And("^I click on submit button$")
    public void i_click_on_submit_button() throws Throwable {
        System.out.println("I click on submit button");
    }
}
