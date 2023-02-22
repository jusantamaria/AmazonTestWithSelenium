package steps;

import pages.AmazonSearchPage;

import org.junit.Assert;

import io.cucumber.java.en.*;

public class AmazonSearchSteps {

AmazonSearchPage amazon = new AmazonSearchPage();

@Given("^The use navigates to www.amazon.com$")
    public void navigateToAmazon(){
        amazon.navigateToAmazon();
    }

@And("^Searches for (.+)$")
    public void enterSearchCriteria(String criteria){
        amazon.enterSearchCriteria(criteria);
        amazon.clickSearch();
    }

@And("^Navigates to the page number (.+)$")
    public void goToPage(String pageNumber){
        amazon.goToPage(pageNumber);
    }

@And("^Selects the third item$")
    public void selectThirdItem(){
        amazon.pick3rdItem();
    }

@Then("^The user is able to add it to the cart$")
    public void itemCanBeAddedToTheCart(){
        amazon.addToCart();
        Assert.assertEquals("Added to the Cart", amazon.addedToCartMessage());
    }
    
}
