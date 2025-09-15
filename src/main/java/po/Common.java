package po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertTrue;

public class Common extends DriverManager
{

    public void sleep()
    {
        try
        {
            Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }
    }


    public void clickLink(String link)
    {
        String linkText = "//a[text() = '" + link + "']";
        webDriver.findElement(By.xpath(linkText)).click();
    }

    public void clickButton(String text)
    {
        String button = "//button[text() = '" + text + "']";
        webDriver.findElement(By.xpath(button)).click();

    }

    public void clickCheckBox(String text)
    {
        String label = "//label[text() = '" + text + "']";
        webDriver.findElement(By.xpath(label)).click();

    }


}
