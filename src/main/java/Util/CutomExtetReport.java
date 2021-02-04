package Util;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CutomExtetReport {


    public ExtentReports extent;
    public ExtentSparkReporter reporter;

    public CutomExtetReport()
    {
        reporter = new ExtentSparkReporter("Reports\\report.html");
        extent = new ExtentReports();
        extent.attachReporter(reporter);
        reporter.config().setDocumentTitle("Project information title");
        reporter.config().setReportName("All regression test");

        extent.setSystemInfo("Project name","Billing");
        extent.setSystemInfo("Developers name","Dhanashri");
        extent.setSystemInfo("Testers name","Shilpa");
        extent.setSystemInfo("Test Lead","Lalita");
        extent.setSystemInfo("Start date","10/12/2020");
        extent.setSystemInfo("Location","Banglore");
    }

    public static String takeScreenshot(WebDriver driver) throws IOException {

        TakesScreenshot ts = (TakesScreenshot) driver;

        File srcFile = ts.getScreenshotAs(OutputType.FILE);

        String timestamp= new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss").format(new Date());

        String filename="screenshot_"+timestamp+".png";

        FileUtils.copyFile(srcFile,new File("Reports\\screenshots\\"+filename));

        return  filename;
    }


    public void creatingTest(Scenario scenario,WebDriver driver) throws IOException {
        ExtentTest test = extent.createTest(scenario.getName());

        switch (scenario.getStatus())
        {
            case PASSED:

                test.pass("this scenario is passed"); break;

            case SKIPPED:
                test.skip("this test is skipped");
                 break;

            case FAILED: test.fail("Test is failed");

                  test.addScreenCaptureFromPath("./screenshots/"+takeScreenshot(driver));

            break;
        }
    }


    public void createReport()
    {
        if(extent!=null) {
            extent.flush();
        }
        }

}
