package steps;
 
import io.cucumber.java.en.Given;
import pages.PaginaPrincipal;
 
public class demonBlazeLandingPage {
 
    PaginaPrincipal landingPage = new PaginaPrincipal();
 
    @Given("I navigate to demoblaze")
    public void iNavigateToFRT() {
        landingPage.navigateToFreeRangeTesters();
    }
 
}