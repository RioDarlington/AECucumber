package po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.assertTrue;

public class Common
{
    WebDriver webDriver;
    public Common(WebDriver webDriver)
    {
        this.webDriver = webDriver;
    }

    public boolean titleIs(String title)
    {
        return webDriver.getTitle().equals(title);

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
