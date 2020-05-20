package exerciseOne.formyproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test_ScrollToElement {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "E:/LinkedIn/Selenium Essential Training/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/scroll");

        WebElement name = driver.findElement(By.id("name"));

        Actions actions = new Actions(driver);
        actions.moveToElement(name);

        name.click();
        name.sendKeys("Swathi Liz");

        WebElement date = driver.findElement(By.id("date"));
        date.click();
        date.sendKeys("01/02/2020");

        driver.quit();
    }
}
