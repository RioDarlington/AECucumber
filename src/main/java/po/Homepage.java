package po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.ByChained;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class Homepage extends DriverManager
{
    By signUp = By.partialLinkText("Signup / Login");
    By consent = By.className("fc-button-label");

    public void signUp()
    {
        webDriver.findElement(signUp).click();
    }
    public void consent()
    {
        if (!webDriver.findElements(consent).isEmpty())
        {
            webDriver.findElement(consent).click();
        }


    }

    public void verifyLoggedIn(String name)
    {
        String b = "//b[text() = '" + name + "']";
        webDriver.findElement(By.xpath(b));
    }

    public void selectProduct(String item)
    {
        String p = "//p[text() = '" + item + "']";
        webDriver.findElement(By.xpath(p)).click();
    }

    public void selectItem(String item)
    {
        int index = Integer.parseInt(item);
        List<WebElement> elements = webDriver.findElements(By.className("choose"));
        elements.get(index - 1).click();
    }

    public void selectQuantityAndAddToCart(String amount)
    {
        WebElement quantity = webDriver.findElement(By.id("quantity"));
        quantity.clear();
        quantity.sendKeys(amount);

        By findCart = new ByChained(By.className("product-information"), By.tagName("button"));
        WebElement cart = webDriver.findElement(findCart);
        cart.click();
    }

    public void goToCart()
    {
        By goToCart = new ByChained(By.className("text-center"), By.linkText("View Cart"));
        WebElement openCart = webDriver.findElement(goToCart);
        openCart.click();
    }

    public final Integer CARDNAME = 0;
    public final Integer CARDNUMBER = 1;
    public final Integer CVC = 2;
    public final Integer EXPIRATIONMONTH = 3;
    public final Integer EXPIRATIONYEAR = 4;

    private final By CARD_NAME_NAME = By.name("name_on_card");
    private final By CARD_NUMBER_NAME = By.name("card_number");
    private final By CVC_NAME = By.name("cvc");
    private final By EXPIRATION_MONTH_NAME = By.name("expiry_month");
    private final By EXPIRATION_YEAR_NAME = By.name("expiry_year");

    public void completeBankDetails(List<String> bankDetails)
    {
        webDriver.findElement(CARD_NAME_NAME).sendKeys(bankDetails.get(CARDNAME));
        webDriver.findElement(CARD_NUMBER_NAME).sendKeys(bankDetails.get(CARDNUMBER));
        webDriver.findElement(CVC_NAME).sendKeys(bankDetails.get(CVC));
        webDriver.findElement(EXPIRATION_MONTH_NAME).sendKeys(bankDetails.get(EXPIRATIONMONTH));
        webDriver.findElement(EXPIRATION_YEAR_NAME).sendKeys(bankDetails.get(EXPIRATIONYEAR));


    }
}
