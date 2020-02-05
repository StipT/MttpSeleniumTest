package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(id = "ctl00_ContentPlaceHolder1_login_login")
    private WebElement usernameEditBox;

    @FindBy(id = "ctl00_ContentPlaceHolder1_login_pass")
    private WebElement passwordEditBox;

    @FindBy(id = "ctl00_ContentPlaceHolder1_login_regBtn")
    private WebElement loginButton;

    @FindBy(id = "ctl00_ContentPlaceHolder1_login_register")
    private WebElement goToRegisterButton;

    public void writeLoginInfo(String username, String password) {
        usernameEditBox.sendKeys(username);
        passwordEditBox.sendKeys(password);
    }

    public void login() {
        loginButton.click();
    }

    public void goToRegister() {
        goToRegisterButton.click();
    }
}
