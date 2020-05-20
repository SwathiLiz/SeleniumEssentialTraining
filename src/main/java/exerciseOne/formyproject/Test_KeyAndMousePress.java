package exerciseOne.formyproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_KeyAndMousePress {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "E:/LinkedIn/Selenium Essential Training/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/keypress");

        //driver.findElement(By.linkText("Key and Mouse Press")).click();

        WebElement nameField = driver.findElement(By.cssSelector(".form-control[id='name']"));
        nameField.click();
        nameField.sendKeys("Swathi Liz");

        driver.findElement(By.id("button")).click();

        driver.quit();
    }

}
