import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

class BrowserFactory {

    private static WebDriver driver;

    static WebDriver startBrowser(String browserName, String url) {
        if (browserName.equalsIgnoreCase(InputStrings.CHROME_TEST)) {
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase(InputStrings.FIREFOX_TEST)) {
            driver = new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase(InputStrings.INTERNET_EXPLORER_TEST)) {
            driver = new InternetExplorerDriver();
        }
        driver.manage().window().maximize();
        driver.get(url);
        return driver;
    }
}
