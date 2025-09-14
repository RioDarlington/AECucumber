package po;

import org.openqa.selenium.By;
import utils.FileUtils;
import utils.StringUtils;

import static org.junit.Assert.assertTrue;

public class SignUpLogin extends DriverManager
{
    By name = By.name("name");


    public void details()
    {
        String email = StringUtils.randomEmail();
        webDriver.findElement(name).sendKeys("Rio Darlington");
        webDriver.findElement(By.cssSelector("[data-qa='signup-email']")).sendKeys(email);
        FileUtils.store(email);
    }
}
