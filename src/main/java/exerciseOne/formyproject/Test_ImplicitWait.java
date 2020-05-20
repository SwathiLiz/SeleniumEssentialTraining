package exerciseOne.formyproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Test_ImplicitWait {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "E:/LinkedIn/Selenium Essential Training/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/fileupload");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.quit();

    }

}