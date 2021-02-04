package Stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static Stepdefinition.Hooks.getDriver;

public class LoginSD {

   static WebDriver driver;

    @Given("I am on login page")
    public void i_am_on_login_page() {

        System.out.println("I am on login page");
        WebDriverManager.chromedriver().setup();
        driver = getDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.net");

    }

    @When("I enter valid username valid password")
    public void i_enter_valid_username_valid_password() {
        System.out.println("I enter valid username valid password");

        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin");

    }
    @When("I click on login button")
    public void i_click_on_login_button() {
        System.out.println("I click on login button");

        driver.findElement(By.xpath("//input[@value='LOG IN']")).click();

         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Then("I should be land up to the home page")
    public void i_should_be_land_up_to_the_home_page() {
        System.out.println("I should be land up to the home page");

        String expected = "http://stock.scriptinglogic.net/dashboard.php1";
        String actual = driver.getCurrentUrl();

        Assert.assertEquals(actual,expected,"test is failed");


    }



}
