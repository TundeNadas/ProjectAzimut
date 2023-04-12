package stepsDefinition;

import helpers.WebDriverHelper;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static java.lang.Thread.sleep;

public class Login {
    private WebDriver driver;

    @Before
    public void setup(){
        driver = driver = WebDriverHelper.getConfiguredWebDriver();
    }
    @After
    public void tearDown(){
        driver.quit();
    }


    //URL-uri
    @Given("Open Azimut demo Login page")
    public void open_Azimut_demo_Login_page() throws InterruptedException {
        driver.get("https://demo.automationtesting.in/Index.html");
        sleep(3000);
    }

    //Steps for Login page
    @Then("I enter email")
    public void iEnterEmailForString () throws InterruptedException {

        driver.findElement(By.xpath("//*[@id='email']"))
                .sendKeys("adresaDeEmail");
        sleep(3000);
    }

    @And("I click the Login button")
    public void iClickTheLoginButton() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id='enterimg']")).click();
        sleep(3000);
    }

}
