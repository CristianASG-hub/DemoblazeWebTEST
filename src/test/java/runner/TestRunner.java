package runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import pages.BasePage;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src\\test\\resources\\features",
    glue =  "steps",
    plugin = {"pretty", "html:target/cucumber-reports"}
)


public class TestRunner {

    @BeforeClass
    public static void  fullWindow(){
        BasePage.fullWindowSize();
    }
      
    @AfterClass

    public static void closeDriver(){
        BasePage.closeBrowser();
    }
}
