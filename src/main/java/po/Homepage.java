package po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;

public class Homepage
{
    WebDriver webDriver;
    By signUp = By.partialLinkText("Signup / Login");
    By consent = By.className("fc-button-label");

    public Homepage(WebDriver webDriver)
    {
        this.webDriver = webDriver;
    }



    public void signUp()
    {
        webDriver.findElement(signUp).click();
    }
    public void consent()
    {
        webDriver.findElement(consent).click();
    }
}
