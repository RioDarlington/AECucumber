package po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SignUp
{
    WebDriver webDriver;

    public final Integer TITLE = 0;
    public final Integer PASSWORD = 1;
    public final Integer DATEOFBIRTH = 2;

    private final By PASSWORD_FIELD = By.id("password");
    private final By DAYS = By.id("days");
    private final By MONTHS = By.id("months");
    private final By YEARS = By.id("years");

    public SignUp(WebDriver webDriver)
    {
        this.webDriver = webDriver;
    }

    public void completeForm(String title, String password, String dOB)
    {
        webDriver.findElement(By.cssSelector("[value='" + title + "']")).click();
        webDriver.findElement(PASSWORD_FIELD).sendKeys(password);

        WebElement days = webDriver.findElement(DAYS);
        days.click();
        List<WebElement> dayOptions = days.findElements(By.tagName("option"));
        String chosenDay = dOB.substring(0,2);
        int dayIndex = Integer.parseInt(chosenDay);
        dayOptions.get(dayIndex).click();

        WebElement months = webDriver.findElement(MONTHS);
        months.click();
        List<WebElement> monthOptions = months.findElements(By.tagName("option"));
        String chosenMonth = dOB.substring(3,5);
        int monthIndex = Integer.parseInt(chosenMonth);
        monthOptions.get(monthIndex).click();

        // Most Efficient Way //
        Select years = new Select(webDriver.findElement(YEARS));
        String chosenYear = dOB.substring(6,10);
        years.selectByValue(chosenYear);
    }

}
