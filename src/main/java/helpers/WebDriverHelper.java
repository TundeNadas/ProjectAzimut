package helpers;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverHelper {
    private static WebDriver webDriver;

    public static WebDriver getConfiguredWebDriver(){
        if(webDriver==null){
            configureWebDriver();
        }

        return webDriver;
    }

    private static void configureWebDriver() {
        System.setProperty("webdriver.chrome.driver",
                System.getProperty("user.dir") + "/src/main/java/driver/chromedriver.exe");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        webDriver = new ChromeDriver(chromeOptions);
        webDriver.manage().window().maximize();
    }
}
