package po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.FileUtils;
import utils.StringUtils;


public class Login extends DriverManager
{
    By password = By.name("password");

    public void loginDetails()
    {
        webDriver.findElement(By.cssSelector("[data-qa='login-email']")).sendKeys(FileUtils.retrieve());
        webDriver.findElement(password).sendKeys("PASSWORD!");


    }
}
