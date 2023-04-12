package stepsDefinition;

import helpers.WebDriverHelper;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;   
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static java.lang.Thread.sleep;

public class SwitchToAlerts {

    private WebDriver driver;

    @Before
    public void setup(){
        driver = WebDriverHelper.getConfiguredWebDriver();
    }
    @After
    public void tearDown(){
        driver.quit();
    }

    @Given("Open Azimut Demo Alert page")
    public void open_azimut_demo_alert_page() throws InterruptedException {
        driver.get("https://demo.automationtesting.in/Alerts.html");
        sleep(3000);
    }

    @When("Select Section {string}")
    public void select_section(String section) throws InterruptedException {
        driver.findElement(By.xpath("//a[@href='#"+section+"']")).click();
        sleep(3000);
    }

    @Then("Click on section Button {string}")
    public void click_on_section_button(String button) throws InterruptedException {
        driver.findElement(By.xpath("//button[@class='" + button + "']")).click();
        sleep(3000);
    }

    @Then("I enter my name {string}")
    public void i_enter_my_name(String name) throws InterruptedException {
        Alert al = driver.switchTo().alert();
        al.sendKeys(name);
        al.accept();
        sleep(3000);
    }

    @Then("Accept Alert")
    public void accept_alert() throws InterruptedException {
        Alert al = driver.switchTo().alert();
        System.out.println(al.getText());
        sleep(3000);
    }

    @Then("Cancel Alert")
    public void cancel_alert() throws InterruptedException {
        Alert al = driver.switchTo().alert();
        al.dismiss();
        sleep(3000);
    }
}
