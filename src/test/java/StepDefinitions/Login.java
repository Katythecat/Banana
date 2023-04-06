package StepDefinitions;

import Utils.CommonMethods;
import Utils.ConfigReader;
import Utils.Constants;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class Login extends CommonMethods {


    @Given("open the browser and HRM application")
    public void open_the_browser_and_hrm_application() throws IOException {

        openBrowser();


    }
    @When("enter valid username and password")
    public void enter_valid_username_and_password() {
        driver.findElement(By.id("txtUsername")).sendKeys(ConfigReader.getPropValue("username"));
        driver.findElement(By.id("txtPassword")).sendKeys(ConfigReader.getPropValue("password"));

    }
    @When("click on login button")
    public void click_on_login_button() {
        driver.findElement(By.id("btnLogin")).click();

    }
    @Then("user login successfully")
    public void user_login_successfully() {
        boolean text=driver.findElement(By.id("welcome")).isDisplayed();
        if(text){
            System.out.println("User logged in successfully");
        }else{
            System.out.println("Wrong application");
        }

    }
    @Then("close the browser")
    public void close_the_browser() {
        closeBrowser();

    }
}
