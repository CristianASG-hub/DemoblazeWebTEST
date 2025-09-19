package pages;
 
public class PaginaPrincipal extends BasePage {
 

    private String LaptosButton = "//a[contains(text(),'Laptops')]";
    private String sectionLink = "//a[contains(@class, 'nav-link') and normalize-space(text())='%s']";
    private String celullarImage = "img[src='imgs/galaxy_s6.jpg']";
    private String phoneCagories ="//a[contains(text(),'Phones')]";


    public PaginaPrincipal() {
        super(driver);
    }
 

    public void navigateToDMB() {
        navigateTo("https://www.demoblaze.com");
        clickElement(LaptosButton);
    }

    public void clickOnSectionNavigationBar(String section) {
        // Reemplaza el marcador de posición en sectionLink con el nombre
        System.out.println("Seleccionando sección: " + section);
        String xpathSection = String.format(sectionLink, section);
        clickElement(xpathSection);
    }

    public void clickOnImage(){
        clickElementCss(celullarImage);
    }

    public void clickOnPhoneCategories(){
        clickElement(phoneCagories);
    }
 
}

