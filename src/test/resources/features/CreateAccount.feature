Feature: This feature will register and delete an account.

  #    Background
  Background:
    Given i have opened a browser

  #    Create Account
  Scenario: CreatingAccount.
    Given i navigate to "https://automationexercise.com/"
    And Verify page title is "Automation Exercise"
    And Click on " Signup / Login" link
    And Verify page title is "Automation Exercise - Signup / Login"
    And Enter name and email address
    And Click on "Signup" button
    And Verify page title is "Automation Exercise - Signup"
    And Enter details:
      |Mr|
      |PASSWORD!|
      |02/02/2007|
    And Select checkbox "Sign up for our newsletter!"
    And Select checkbox "Receive special offers from our partners!"
    And Fill Address details:
      |Rio|
      |Darlington|
      |Darlington Limited|
      |66 Overthere Lane|
      |Sheffield|
      |Canada|
      |South Yorkshire|
      |Sheffield|
      |S739TA|
      |07898677251|
    And Click on "Create Account" button
    And Verify page title is "Automation Exercise - Account Created"
    And Click on "Continue" link
    And Click on " Logout" link

  #    Sign In
  Scenario: Login and order.
    Given i have opened a browser
    When i navigate to "https://automationexercise.com/"
    And Click on " Signup / Login" link
    And Verify page title is "Automation Exercise - Signup / Login"
    And Enter email and password
    And Click on "Login" button
    And Verify that i am logged in as:
      |Rio Darlington|
    And i select the following item:
      |2|
    And i select the quantity and add to cart:
      |5|
    And Click go to cart
    And Click on "Proceed To Checkout" link
    And Click on "Place Order" link
    And Fill Bank details:
      |Rio Darlington|
      |1234 1234 1234 1234|
      |111|
      |05|
      |2027|
    And Click on "Pay and Confirm Order" button
    And Verify page title is "Automation Exercise - Order Placed"
    And Click on " Logout" link
  #    Delete Account
#    And Verify page title is "Automation Exercise"
#    And Click on " Delete Account" link
#    And Click on "Continue" link