import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;
import pages.*;

import java.util.concurrent.TimeUnit;

public class eKupiTestChrome {

    private WebDriver driver;

    @BeforeClass
    public static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod
    public void setupTest() {
        driver = BrowserFactory.startBrowser(InputStrings.CHROME_TEST, InputStrings.BASE_URL);
    }

    @Test
    public void registerTest() throws InterruptedException {
        MainPage mainPage = PageFactory.initElements(driver, MainPage.class);
        mainPage.goToLogin();

        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.goToRegister();

        RegisterPage registerPage = PageFactory.initElements(driver, RegisterPage.class);
        registerPage.writeRegisterInfo(
                InputStrings.REGISTER_EMAIL,
                InputStrings.REGISTER_NAME,
                InputStrings.REGISTER_SURNAME,
                InputStrings.REGISTER_USERNAME,
                InputStrings.REGISTER_PASSWORD
        );
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        registerPage.agreeToTermsAndConditions();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        registerPage.register();
    }

    @Test
    public void loginTest() throws InterruptedException {
        MainPage mainPage = PageFactory.initElements(driver, MainPage.class);
        mainPage.goToLogin();
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.writeLoginInfo(InputStrings.LOGIN_NAME, InputStrings.LOGIN_PASSWORD);
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        loginPage.login();
    }

    @Test
    public void query() {
        MainPage mainPage = PageFactory.initElements(driver, MainPage.class);
        mainPage.customSearch(InputStrings.CUSTOM_SEARCH);
        mainPage.confirmSearch();
    }


    @Test
    public void addToCartTest() {
        query();
        SearchResultPage searchResultPage = PageFactory.initElements(driver, SearchResultPage.class);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        searchResultPage.selectFirstArticle();

        ArticleDetailPage articleDetailPage = PageFactory.initElements(driver, ArticleDetailPage.class);
        articleDetailPage.addToCart();
        articleDetailPage.ignorePromotion();
    }

    @Test
    public void removeFromCart() {
        addToCartTest();
        CartPage cartPage = PageFactory.initElements(driver, CartPage.class);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        cartPage.removeFromCart();
    }


    @AfterMethod
    public void teardownTest() {
        if (driver != null) {
            driver.quit();
        }
    }
}