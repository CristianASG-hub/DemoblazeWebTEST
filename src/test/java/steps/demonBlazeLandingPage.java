package steps;
 
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PaginaPrincipal;
 
public class demonBlazeLandingPage {
 
    PaginaPrincipal landingPage = new PaginaPrincipal();
 
    @Given("I navigate to demoblaze")
    public void iNavigateToFRT() {
        landingPage.navigateToFreeRangeTesters();
    }

     @Then("^I go to (.+) using navigation bar$")
    public void navigationBarUse(String section) {
        landingPage.clickOnSectionNavigationBar(section);
    }
    
 
}