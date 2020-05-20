package exerciseTwo.completeWebForm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import exerciseTwo.pages.ConfirmationPage;
import exerciseTwo.pages.FormPage;

import static org.junit.Assert.assertEquals;

public class Test_CompleteWebForm {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "E:/LinkedIn/Selenium Essential Training/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/form");

        FormPage formPage = new FormPage();
        formPage.SubmitForm(driver);

        ConfirmationPage confirmationPage = new ConfirmationPage();
        confirmationPage.WaitForAlertBanner(driver);

        assertEquals("The form was successfully submitted!", confirmationPage.GetAlertBannerText(driver));

        driver.quit();
    }

}
