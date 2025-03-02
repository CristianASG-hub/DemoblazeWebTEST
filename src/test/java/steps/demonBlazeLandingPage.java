package steps;
 
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.PaginaPrincipal;
 
public class demonBlazeLandingPage {
 
    PaginaPrincipal landingPage = new PaginaPrincipal();
 
    @Given("I navigate to demoblaze")
    public void iNavigateToFRT() {
        landingPage.navigateToFreeRangeTesters();
    }

     @When("I go to {word} using navigation bar")
    public void navigationBarUse(String section) {
        landingPage.clickOnSectionNavigationBar(section);
    }
 
}