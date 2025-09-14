package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import po.Common;
import po.Homepage;
import po.SignUp;
import po.SignUpLogin;
import po.Login;
import po.DriverManager;

import java.util.List;

import static org.junit.Assert.assertTrue;
import static utils.Log.log;

public class Steps
{
    DriverManager driverManager;
    Homepage homepage;
    SignUpLogin signUpLogin;
    Common common;
    SignUp signUp;
    Login login;




    @Given("i have opened a browser")
    public void iHaveOpenedABrowser()
    {
        log("I have opened a browser");
        driverManager = new DriverManager();
        homepage = new Homepage();
        signUpLogin = new SignUpLogin();
        common = new Common();
        signUp = new SignUp();
        login = new Login();
    }

    @When("i navigate to {string}")
    public void iNavigateToURL(String url)
    {
        log("i navigate to the URL");
        driverManager.get(url);
        homepage.consent();
    }


    @And("Click on Signup Login button")
    public void clickOnSignupLoginButton()
    {
        homepage.signUp();
    }



    @And("Enter name and email address")
    public void enterNameAndEmailAddress()
    {
        signUpLogin.details();
    }

    @And("Enter details:")
    public void enterDetails(List <String> details)
    {
        signUp.completeForm(details.get(signUp.TITLE),
                            details.get(signUp.PASSWORD),
                            details.get(signUp.DATEOFBIRTH));
    }


    @And("Fill Address details:")
    public void fillAddressDetails(List<String> addressDetails)
    {
        signUp.completeAddress(addressDetails);
    }

    @And("Click {string}")
    public void clickCreateAccountButton()
    {

    }

    @And("Verify that {string} is visible and click {string} button")
    public void verifyThatACCOUNTDELETEDIsVisibleAndClickContinueButton() {
    }

    @And("Verify that i am logged in as:")
    public void verifyThatIAmLoggedInAs(List<String> list)
    {
        homepage.verifyLoggedIn(list.getFirst());
    }

    @And("i select the following product:")
    public void iSelectTheFollowingProduct(List<String> list)
    {
        homepage.selectProduct(list.getFirst());
    }


// Common Steps
    @And("Verify page title is {string}")
    public void verifyPageTitleIsString(String title)
    {
//        assertTrue(common.titleIs(title));
    }

    @And("Click on {string} button")
    public void clickOnButton(String text)
    {
        common.clickButton(text);
    }

    @And("Click on {string} link")
    public void clickOnLink(String link)
    {
        common.clickLink(link);
    }


    @And("Select checkbox {string}")
    public void selectCheckbox(String label)
    {
        common.clickCheckBox(label);
    }


    @And("Enter email and password")
    public void enterEmailAndPassword()
    {
        login.loginDetails();
    }


    @And("i select the following item:")
    public void iSelectTheFollowingItem(List<String> item)
    {
        homepage.selectItem(item.getFirst());
    }

    @And("i select the quantity and add to cart:")
    public void iSelectTheQuantityAndAddToCart(List<String> amount)
    {
        homepage.selectQuantityAndAddToCart(amount.getFirst());
    }


    @And("Click go to cart")
    public void clickGoToCart()
    {
        homepage.goToCart();
    }

    @And("i sleep")
    public void iSleep()
    {
        common.sleep();
    }

    @And("Fill Bank details:")
    public void fillBankDetails(List<String> bankDetails)
    {
        homepage.completeBankDetails(bankDetails);
    }
}



