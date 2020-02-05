package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage {

    private WebDriver driver;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(id = "ctl00_ContentPlaceHolder1_regNormal_txtRegEmail")
    private WebElement emailEditBox;

    @FindBy(id = "ctl00_ContentPlaceHolder1_regNormal_txtFirstName")
    private WebElement nameEditBox;

    @FindBy(id = "ctl00_ContentPlaceHolder1_regNormal_txtLastName")
    private WebElement surnameEditBox;

    @FindBy(id = "ctl00_ContentPlaceHolder1_regNormal_txtRegUsername")
    private WebElement usernameEditBox;

    @FindBy(id = "ctl00_ContentPlaceHolder1_regNormal_txtRegPassword")
    private WebElement passwordEditBox;

    @FindBy(id = "ctl00_ContentPlaceHolder1_regNormal_txtRegPassword2")
    private WebElement rePasswordEditBox;

    @FindBy(id = "ctl00_ContentPlaceHolder1_regNormal_acceptBusiness")
    private WebElement agreementCheckBox;

    @FindBy(id = "btnReg")
    private WebElement registerButton;


    public void writeRegisterInfo(String email, String password, String firstName, String lastName, String username) {
        emailEditBox.sendKeys(email);
        nameEditBox.sendKeys(firstName);
        surnameEditBox.sendKeys(lastName);
        usernameEditBox.sendKeys(username);
        passwordEditBox.sendKeys(password);
        rePasswordEditBox.sendKeys(password);
    }

    public void agreeToTermsAndConditions() {

        agreementCheckBox.click();
    }

    public void register() {

        registerButton.click();
    }
}
