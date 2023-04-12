package stepsDefinition;

import helpers.WebDriverHelper;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static java.lang.Thread.sleep;

public class SwitchToFrame {

    private WebDriver driver;

    @Before
    public void setup(){
        driver = WebDriverHelper.getConfiguredWebDriver();
    }
    @After
    public void tearDown(){
        driver.quit();
    }

    @Given("Open Azimut Demo Frame page")
    public void open_azimut_demo_frame_page() throws  InterruptedException{
        driver.get("https://demo.automationtesting.in/Frames.html");
        sleep(3000);
    }

@Then("Click {string}")
public void click_i_frame_with_in_an_i_frame(String iframes)throws InterruptedException {
    driver.findElement(By.xpath("//*[@href='#"+iframes+"']")).click();
    sleep(3000);
}
    @Then("Enter input1 {string}")
    public void enter_input1(String fruit) throws InterruptedException {
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//input")).sendKeys(fruit);
        driver.switchTo().parentFrame();
        sleep(3000);
    }

    @Then("Enter input2 {string}")
    public void enter_input2(String fruit2)throws InterruptedException {
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='Multiple']/iframe")));
        enter_input1(fruit2);
    }

}
