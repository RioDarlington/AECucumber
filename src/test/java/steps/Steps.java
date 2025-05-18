package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import po.Common;
import po.Homepage;
import po.SignUp;
import po.SignUpLogin;
import utils.DriverManager;

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


    @Given("i have opened a browser")
    public void iHaveOpenedABrowser()
    {
        log("I have opened a browser");
        driverManager = new DriverManager();
        homepage = new Homepage(driverManager.getWebDriver());
        signUpLogin = new SignUpLogin(driverManager.getWebDriver());
        common = new Common(driverManager.getWebDriver());
        signUp = new SignUp(driverManager.getWebDriver());

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


    @And("Fill details: First name, Last name, Company, Address, Address{int}, Country, State, City, Zipcode, Mobile Number")
    public void fillDetailsFirstNameLastNameCompanyAddressAddressCountryStateCityZipcodeMobileNumber(int arg0) {
    }

    @And("Click {string}")
    public void clickCreateAccountButton() {
    }

    @And("Verify that {string} is visible and click {string} button")
    public void verifyThatACCOUNTDELETEDIsVisibleAndClickContinueButton() {
    }

// Common Steps
    @And("Verify page title is visible {string}")
    public void verifyPageTitleIsVisible(String title)
    {
        assertTrue(common.titleIs(title));
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
}


