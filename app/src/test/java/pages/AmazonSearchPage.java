package pages;

public class AmazonSearchPage extends BasePage {
    
    private String searchBox = "//input[@id='twotabsearchtextbox']";
    private String thirdResult = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/span[1]/div[1]/div[4]/div[1]/div[1]";
    private String addToCartButton = "//input[@id='add-to-cart-button']";
    private String addedMessageText = "//*[contains(text(), 'Agregado al carrito')]";
    private String searchButton = "//input[@id='nav-search-submit-button']";



    public AmazonSearchPage(){
        super(driver);
    }

    public void navigateToAmazon(){
        navigateTo("https://www.amazon.com");
    }

    public void enterSearchCriteria(String criteria){
        write(searchBox, criteria);
    }

    public void clickSearch(){
        clickElement(searchButton);
    }

    public void goToPage(String pageNumber){
        goToLinkText("pageNumber");
    }

    public void pick3rdItem(){
        clickElement(thirdResult);
    }

    public void addToCart(){
        clickElement(addToCartButton);
    }

    public String addedToCartMessage(){
        return textFromElement(addedMessageText);
    } 
}
