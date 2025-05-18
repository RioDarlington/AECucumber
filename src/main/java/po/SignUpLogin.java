package po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;

public class SignUpLogin
{
    WebDriver webDriver;
    By name = By.name("name");

    public SignUpLogin(WebDriver webDriver)
    {
        this.webDriver = webDriver;
    }


    public void details()
    {
        webDriver.findElement(name).sendKeys("Rio Darlington");
        webDriver.findElement(By.cssSelector("[data-qa='signup-email']")).sendKeys("Riomontel@outlooking.com");



    }
}
