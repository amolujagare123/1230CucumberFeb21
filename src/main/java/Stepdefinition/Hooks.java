package Stepdefinition;

import Util.CutomExtetReport;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class Hooks {

    static WebDriver driver;

    public static WebDriver getDriver()
    {
        driver = new ChromeDriver();
        return  driver;
    }


    @Before ("@specialScenario")
    public void mymethod1()
    {
        System.out.println("==========Before scenario========");
    }

    @After  ("@specialScenario")
    public void myMethod2()
    {
        System.out.println("==========After scenario========");
    }

    CutomExtetReport cutomExtetReport;
    boolean isReporterRunning;
    @Before
    public void testScreation()
    {

        if (!isReporterRunning) {
            cutomExtetReport = new CutomExtetReport();
            isReporterRunning =true;
        }


    }

    @After
    public void writeReport(Scenario scenario) throws IOException {
        cutomExtetReport.creatingTest(scenario, driver);
        cutomExtetReport.createReport(); // flush
    }
}
