package stepsDefinition;

import helpers.WebDriverHelper;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.sl.In;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

import static java.lang.Thread.sleep;

public class SwitchToWindows {

    private WebDriver driver;

    @Before
    public void setup(){
        driver = WebDriverHelper.getConfiguredWebDriver();
    }
    @After
    public void tearDown(){
        driver.quit();
    }

    @Given("Open Azimut Demo Windows page")
    public void open_azimut_demo_windows_page() throws InterruptedException {
        driver.get("https://demo.automationtesting.in/Windows.html");
        sleep(3000);
    }

    @When("Select Section {string} page")
    public void select_section_page(String section) throws InterruptedException {
        driver.findElement(By.xpath("//a[@href='#"+section+"']")).click();
        sleep(3000);
    }


    @Then("Click {string} button")
    public void button_click_button(String button) throws  InterruptedException {
        driver.findElement(By.xpath("//*[@id='"+button+"']")).click();
        sleep(3000);
    }

    @Then("Close other window tabs")
    public void close_other_window_tabs() throws InterruptedException{
        String tabPrincipal =driver.getWindowHandle();

        for (String windowHandle : driver.getWindowHandles()) {
            if (!tabPrincipal.contentEquals(windowHandle)){
                driver.switchTo().window(windowHandle);
                System.out.println(driver.getCurrentUrl());
                driver.close();
            }
        }

        sleep(3000);
        driver.switchTo().window(tabPrincipal);
    }

    @Then("Close window tab having url: {string}")
    public void close_window_tab_having_url(String url) throws InterruptedException {
        String tabPrincipal = driver.getWindowHandle();
        for (String windowHandle : driver.getWindowHandles()) {
            if(!tabPrincipal.contentEquals(windowHandle)) {
                driver.switchTo().window(windowHandle);
                String adresaPaginaCurenta = driver.getCurrentUrl();
                System.out.println(driver.getCurrentUrl());
                if(adresaPaginaCurenta.equalsIgnoreCase(url)){
                    driver.close();
                    sleep(3000);
                }

            }
        }

        sleep(3000);
        driver.switchTo().window(tabPrincipal);
    }



}
