package stepsDefinition;

import helpers.WebDriverHelper;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static java.lang.Thread.sleep;

public class Register {
    WebDriver driver;
    @Before("setup")
    public void setup(){
     driver = WebDriverHelper.getConfiguredWebDriver();
    }

    @Given("Open Azimut demo Register page")
    public void open_azimut_demo_register_page() throws InterruptedException {
        driver.get("https://demo.automationtesting.in/Register.html");
        sleep(3000);
    }

    @Then("I enter First Name {string}")
    public void i_enter_first_name(String firstname) throws InterruptedException {
        driver.findElement(By.xpath("//input[@ng-model='FirstName']")).sendKeys(firstname);
        sleep(3000);
    }
    @Then("I enter Last Name {string}")
    public void i_enter_last_name(String lastname) throws InterruptedException {
        driver.findElement(By.xpath("//input[@ng-model='LastName']")).sendKeys(lastname);
        sleep(3000);

    }
    @Then("I enter Address {string}")
    public void i_enter_address(String adress) throws InterruptedException {
        driver.findElement(By.xpath( " //textarea[@ng-model='Adress']")).sendKeys(adress);
        sleep(3000);
    }
    @Then("I enter email adress {string}")
    public void i_enter_email_adress(String emailadress) throws InterruptedException {
        driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys(emailadress);
        sleep(3000);
    }
    @Then("I enter Phone {string}")
    public void i_enter_phone(String phone) throws InterruptedException {
        driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys(phone);
        sleep(3000);
    }
    @Then("I select Gender {string}")
    public void i_select_gender(String gender) throws InterruptedException {
        driver.findElement(By.xpath("//input[@value='Male']")).click();
        sleep(3000);
    }
    @Then("I select Hobbies {string}")
    public void i_select_hobbies(String hobbies) throws InterruptedException {
        driver.findElement(By.xpath("//input[@id='checkbox2']")).click();
        sleep(3000);
    }
    @Then("I select Languages {string}")
    public void i_select_languages(String languages) throws InterruptedException {
        driver.findElement(By.xpath("//div[@id='msdd']")).click();
        driver.findElement(By.xpath("//*[a='Filipino']")).click();
        sleep(3000);

    }
    @Then("I select Skills {string}")
    public void i_select_skills(String skills) throws InterruptedException {
        driver.findElement(By.xpath("//select[@id='Skills']/option[@value='Oracle']")).click();
        sleep(3000);
    }

    @Then("I select Country Buggy")
    public void i_select_country_buggy() throws InterruptedException {
        driver.findElement(By.xpath("//select[@ng-model='country']")).click();
        sleep(3000);
    }

    @Then("I select Country {string}")
    public void i_select_country(String country) throws  InterruptedException {
        driver.findElement(By.xpath("//select[@id='country']/option[@value='Australia']")).click();
        sleep(3000);
    }
    @Then("I enter DateOfBirthYear {string}")
    public void i_enter_date_of_birth_year(String dateofbirthyear) throws InterruptedException {
        driver.findElement(By.xpath("//select[@id='yearbox']/option[@value='1933']")).click();
        sleep(3000);
    }
    @Then("I enter DateOfBirthMonth {string}")
    public void i_enter_date_of_birth_month(String dateofbirthmonth) throws  InterruptedException {
        driver.findElement(By.xpath("//select[@ng-model='monthbox']/option[@value='January']")).click();
        sleep(3000);
    }
    @Then("I enter DateOfBirthDay {string}")
    public void i_enter_date_of_birth_day(String dateofbirthday) throws  InterruptedException {
        driver.findElement(By.xpath("//select[@id='daybox']/option[@value='10']")).click();
        sleep(3000);
    }
    @Then("I enter Password {string}")
    public void i_enter_password(String password) throws InterruptedException {
        driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys(password);
        sleep(3000);
    }
    @Then("I enter Comfirm Password {string}")
    public void i_enter_comfirm_password(String password) throws  InterruptedException {
        driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys(password);
        sleep(3000);
    }
    @Then("I click the Submit Button {string}")
    public void i_click_the_submit_button(String Submit) throws  InterruptedException{
        driver.findElement(By.xpath("//button[@id='submitbtn']")).click();
        sleep(3000);

    }
}
