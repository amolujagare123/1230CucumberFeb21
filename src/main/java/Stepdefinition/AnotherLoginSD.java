package Stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AnotherLoginSD {



    @Given("^I am on billing login page$")
    public void i_am_on_billing_login_page() throws Throwable {
        System.out.println("I am on billing login page");
    }

    @When("^I enter valid username, password$")
    public void i_enter_valid_username_password() throws Throwable {
        System.out.println("I enter valid username, password");
    }

    @Then("^I should be land up to the dashboard$")
    public void i_should_be_land_up_to_the_dashboard() throws Throwable {
        System.out.println("I should be land up to the dashboard");
    }

    @And("^I click on login$")
    public void i_click_on_login() throws Throwable {
        System.out.println("I click on login");
    }


    @When("^I enter invalid username, password$")
    public void i_enter_invalid_username_password() throws Throwable {
        System.out.println("I enter invalid username, password");
    }

    @Then("^I should get error message$")
    public void i_should_get_error_message() throws Throwable {
        System.out.println("I should get error message");
    }


    @When("^I dont enter username, password$")
    public void i_dont_enter_username_password() throws Throwable {
        System.out.println("I dont enter username, password");
    }

    @Then("^I should get another error$")
    public void i_should_get_another_error() throws Throwable {
        System.out.println("I should get another error");
    }

    @When("I enter {string} , {string}")
    public void i_enter(String user, String pass) {

        System.out.println("I enter : "+user+" "+pass);

    }

}
