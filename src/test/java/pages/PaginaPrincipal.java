package pages;
 
public class PaginaPrincipal extends BasePage {
 

    private String LaptosButton = "//a[3]";

    public PaginaPrincipal() {
        super(driver);
    }
 
    // Método para navegar a www.freerangetesters.com
    public void navigateToFreeRangeTesters() {
        navigateTo("https://www.demoblaze.com");
        clickElement(LaptosButton);
    }
 
}

