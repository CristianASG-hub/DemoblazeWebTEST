package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import pages.BasePage;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/", // Directorio de nuestros archivos .feature
        glue = "steps", // Paquete donde tenemos nuestras clases definiendo los steps
        plugin = { "pretty", "html:target/cucumber-reports" })




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
