package exerciseOne.formyproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test_ExplicitWait {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "E:/LinkedIn/Selenium Essential Training/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/fileupload");

        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement fileUploadField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("file-upload-field")));

        driver.quit();

    }

}
