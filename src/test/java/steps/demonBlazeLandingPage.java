package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PaginaPrincipal;

public class demonBlazeLandingPage {
 
    PaginaPrincipal landingPage = new PaginaPrincipal();
 
    @Given("I navigate to demoblaze")
    public void iNavigateToDemoblaze() {
        landingPage.navigateToDMB();
    }

     @Then("^I go to (.+) using navigation bar$")
    public void navigationBarUse(String section) {
        landingPage.clickOnSectionNavigationBar(section);
    }

    @Then("Click on the first picture of the categorie")
    public void clickOnImage(){
        landingPage.clickOnImage();
    }
    @Then("I go to Phones categories")
    public void phoneCategories(){
        landingPage.clickOnPhoneCategories();
    }
}