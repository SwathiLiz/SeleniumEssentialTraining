package exerciseTwo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FormPage {

    public static void SubmitForm(WebDriver driver) {
        driver.findElement(By.id("first-name")).sendKeys("Joe");
        driver.findElement(By.id("last-name")).sendKeys("Smith");
        driver.findElement(By.id("job-title")).sendKeys("QA Analyst");
        driver.findElement(By.id("radio-button-3")).click();
        driver.findElement(By.id("checkbox-1")).click();
        driver.findElement(By.id("select-menu")).click();
        driver.findElement(By.cssSelector("option[value='2']")).click();

        WebElement dateField = driver.findElement(By.id("datepicker"));
        dateField.click();
        dateField.sendKeys("05/20/2020");
        dateField.sendKeys(Keys.RETURN);

        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();
    }

}
