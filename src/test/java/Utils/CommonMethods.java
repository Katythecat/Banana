package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;
import java.time.Duration;

public class CommonMethods {
    public static WebDriver driver;
    public static void openBrowser() throws IOException {
        ConfigReader.readProperty();
        String browserType=ConfigReader.getPropValue("browserType");
        switch (browserType){
            case "Chrome" : driver=new ChromeDriver();break;
            case "Edge" : driver=new EdgeDriver();break;
            case "Firefox" : driver=new FirefoxDriver();break;
        }
        driver.get(ConfigReader.getPropValue("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(Constants.TIME_WAIT));
    }

    public static void closeBrowser(){
        driver.close();
    }

    public static void doClick(WebElement element){
        element.click();
    }

    public static void sendText(WebElement element , String text){
        element.sendKeys(text);
    }

}
