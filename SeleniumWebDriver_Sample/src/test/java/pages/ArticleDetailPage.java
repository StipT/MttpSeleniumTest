package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ArticleDetailPage {

    @FindBy(id = "ctl00_ctl00_ContentPlaceHolder1_InnerContentPlaceHolder_ctl00_addToCartAnch")
    private WebElement addToCartButton;

    @FindBy(id = "ctl00_ctl00_ContentPlaceHolder1_InnerContentPlaceHolder_ctl00_lmodal_closeAnchor")
    private WebElement ignoreAddedPromotionButton;


    public void addToCart() {
        addToCartButton.click();
    }

    public void ignorePromotion() {
        ignoreAddedPromotionButton.click();
    }

}
