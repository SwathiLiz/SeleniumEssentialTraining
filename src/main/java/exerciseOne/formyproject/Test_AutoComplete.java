package exerciseOne.formyproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_AutoComplete {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "E:/LinkedIn/Selenium Essential Training/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/autocomplete");

        WebElement addressField = driver.findElement(By.id("autocomplete"));
        addressField.click();
        addressField.sendKeys("365 Holly Street, Waterloo, Ontario, Canada");
        Thread.sleep(1000);

        WebElement autoCompleteResult = driver.findElement(By.xpath("//div[@class='pac-container pac-logo hdpi']/div[1]"));
        autoCompleteResult.click();

        driver.quit();

    }
}
