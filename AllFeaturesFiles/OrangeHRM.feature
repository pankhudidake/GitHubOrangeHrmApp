Feature: Test OrangeHrm Application

  Scenario: Test Login Page Functionality
    Given user on HomePage
    When user enter valid username and password and click on Login button

 #pooja Automation Test Engineer
  Scenario: Test HomePage Functionality
    When user is on HomePage validate homePage title
    Then validate HomePage URL
    And validate HomePage  Logo
