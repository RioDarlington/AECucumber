Feature: This feature will register and delete an account.

  Scenario: Searching with browser.
    Given i have opened a browser
    When i navigate to "https://automationexercise.com/"
    And Verify page title is visible "Automation Exercise"
    And Click on " Signup / Login" link
    And Verify page title is visible "Automation Exercise - Signup / Login"
    And Enter name and email address
    And Click on "Signup" button
    And Verify page title is visible "Automation Exercise - Signup"
    And Enter details:
    |Mr|
    |PASSWORD!|
    |02/02/2007|
    And Select checkbox "Sign up for our newsletter!"
    And Select checkbox "Receive special offers from our partners!"
    And Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
    And Click "Create Account button"
    And Verify page title is visible ""
    And Click on "Continue" button
    And Verify page title is visible ""
    And Click on "Delete Account" button
    And Verify page title is visible ""
    And Click on "Continue" button