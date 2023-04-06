package StepDefinitions;

import Utils.CommonMethods;
import Utils.ConfigReader;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AddEmployee extends CommonMethods {
    @When("user click on PIM option")
    public void user_click_on_pim_option() {
        doClick(driver.findElement(By.id("menu_pim_viewPimModule")));


    }
    @When("user click on Add employee button")
    public void user_click_on_add_employee_button() {
        doClick(driver.findElement(By.id("menu_pim_addEmployee")));
    }
    @When("user enter username and middlename,and password")
    public void user_enter_username_and_middlename_and_password() {
        //driver.findElement(By.id("firstName")).sendKeys("Leo");
        WebElement firstname=driver.findElement(By.id("firstName"));
        CommonMethods.sendText(firstname,ConfigReader.getPropValue("firstname"));
        //driver.findElement(By.id("middleName")).sendKeys("The cat");
        WebElement middlename=driver.findElement(By.id("middleName"));
        CommonMethods.sendText(middlename, ConfigReader.getPropValue("middlename"));
        //driver.findElement(By.id("lastName")).sendKeys("Rami");
        WebElement lastname=driver.findElement(By.id("lastName"));
        CommonMethods.sendText(lastname,ConfigReader.getPropValue("lastname"));


    }
    @When("user click on save button")
    public void user_click_on_save_button() {
        doClick(driver.findElement(By.id("btnSave")));
    }

}
