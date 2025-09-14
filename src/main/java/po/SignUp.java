package po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SignUp extends DriverManager
{


    public final Integer TITLE = 0;
    public final Integer PASSWORD = 1;
    public final Integer DATEOFBIRTH = 2;

    private final By PASSWORD_FIELD = By.id("password");
    private final By DAYS = By.id("days");
    private final By MONTHS = By.id("months");
    private final By YEARS = By.id("years");

    public final Integer FIRSTNAME = 0;
    public final Integer LASTNAME = 1;
    public final Integer COMPANY = 2;
    public final Integer ADDRESS = 3;
    public final Integer ADDRESS2 = 4;
    public final Integer COUNTRY = 5;
    public final Integer STATE = 6;
    public final Integer CITY = 7;
    public final Integer ZIPCODE = 8;
    public final Integer MOBILENUMBER = 9;

    private final By FIRST_NAME_ID = By.id("first_name");
    private final By LAST_NAME_ID = By.id("last_name");
    private final By COMPANY_ID = By.id("company");
    private final By ADDRESS_ID = By.id("address1");
    private final By ADDRESS2_ID = By.id("address2");
    private final By COUNTRY_ID = By.id("country");
    private final By STATE_ID = By.id("state");
    private final By CITY_ID = By.id("city");
    private final By ZIPCODE_ID = By.id("zipcode");
    private final By MOBILENUMBER_ID = By.id("mobile_number");





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
    public void completeAddress(List<String> addressDetails)
    {
        webDriver.findElement(FIRST_NAME_ID).sendKeys(addressDetails.get(FIRSTNAME));
        webDriver.findElement(LAST_NAME_ID).sendKeys(addressDetails.get(LASTNAME));
        webDriver.findElement(COMPANY_ID).sendKeys(addressDetails.get(COMPANY));
        webDriver.findElement(ADDRESS_ID).sendKeys(addressDetails.get(ADDRESS));
        webDriver.findElement(ADDRESS2_ID).sendKeys(addressDetails.get(ADDRESS2));
        webDriver.findElement(COUNTRY_ID).sendKeys(addressDetails.get(COUNTRY));
        webDriver.findElement(STATE_ID).sendKeys(addressDetails.get(STATE));
        webDriver.findElement(CITY_ID).sendKeys(addressDetails.get(CITY));
        webDriver.findElement(ZIPCODE_ID).sendKeys(addressDetails.get(ZIPCODE));
        webDriver.findElement(MOBILENUMBER_ID).sendKeys(addressDetails.get(MOBILENUMBER));
    }



}
