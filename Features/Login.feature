Feature: Login

  Scenario: Successful Login with Valid Credentials
    Given User Launch Chrome Browser
    When User opens URL "https://admin-demo.nopcommerce.com/login"
    And User Enters email as "admin@yourstore.com" and password as "admin"
    And Click on Login
    Then Page Title should be "Dashboard / nopCommerce administration"
    When User click on Log out link
    Then Page Title should be "Your store. Login"
    And close browser


