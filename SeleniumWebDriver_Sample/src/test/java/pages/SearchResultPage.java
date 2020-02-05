package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultPage {

    @FindBy(xpath = "//*[@id=\"ctl00_ctl00_ContentPlaceHolder1_InnerContentPlaceHolder_ctl00_rpt\"]/article[1]/a/span[2]")
    private WebElement firstArticle;

    public void selectFirstArticle() {
        firstArticle.click();
    }
}
