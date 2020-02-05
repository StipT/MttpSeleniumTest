package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage {

    @FindBy(xpath = "//*[@id=\"ctl00_ContentPlaceHolder1_cart_rptShoppingCartItems\"]/article/div[2]/div[2]/a")
    private WebElement removeFromCartButton;


    public void removeFromCart() {
        removeFromCartButton.click();
    }
}
