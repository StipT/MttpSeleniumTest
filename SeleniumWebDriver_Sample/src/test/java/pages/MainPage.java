package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage {

    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(id = "ctl00_usInfo_login")
    private WebElement loginElement;

    @FindBy(id = "ctl00_ContentPlaceHolder1_loginRegB_reg")
    private WebElement registerElement;

    @FindBy(id = "ctl00_topCart_gotoCart")
    private WebElement cartButton;

    @FindBy(id = "ctl00_sb1_search_input2")
    private WebElement searchBar;

    @FindBy(id = "searchBtn2")
    private WebElement searchBoxConfirmButton;


    public void goToLogin() {
        loginElement.click();
    }

    public void goToRegister() {
        registerElement.click();
    }

    public void gotToCart() {
        cartButton.click();
    }

    public void customSearch(String searchString) {
        searchBar.sendKeys(searchString);
    }
    public void confirmSearch() {
        searchBoxConfirmButton.click();
    }
}
