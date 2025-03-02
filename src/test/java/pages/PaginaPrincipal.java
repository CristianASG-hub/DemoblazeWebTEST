package pages;
 
public class PaginaPrincipal extends BasePage {
 

    private String LaptosButton = "//a[contains(text(),'Laptops')]";
    private String sectionLink = "//a[contains(@class, 'nav-link') and normalize-space(text())='%s']";
    

    public PaginaPrincipal() {
        super(driver);
    }
 
    // Método para navegar a www.freerangetesters.com
    public void navigateToFreeRangeTesters() {
        navigateTo("https://www.demoblaze.com");
        clickElement(LaptosButton);
    }

    public void clickOnSectionNavigationBar(String section) {
        // Reemplaza el marcador de posición en sectionLink con el nombre
        System.out.println("Seleccionando sección: " + section);
        String xpathSection = String.format(sectionLink, section);
        clickElement(xpathSection);
    }
 
}

