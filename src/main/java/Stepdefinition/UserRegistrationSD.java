package Stepdefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class UserRegistrationSD {


    @Given("I am on user registration page")
    public void i_am_on_user_registration_page() {
        System.out.println("I am on user registration page");
    }




    @When("I enter below Data")
    public void i_enter_below_data(DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.

      List<String> dt  = dataTable.asList();

        System.out.println("First name" +dt.get(0) );
        System.out.println("Last Name" +dt.get(1) );
        System.out.println("Number" +dt.get(2) );
        System.out.println("Email" +dt.get(3) );



    }

    @Then("^data Should be inserted$")
    public void data_should_be_inserted() throws Throwable {
        System.out.println("data Should be inserted");
    }

    @And("^I click on save button$")
    public void i_click_on_save_button() throws Throwable {
        System.out.println("I click on save button");
    }

}
