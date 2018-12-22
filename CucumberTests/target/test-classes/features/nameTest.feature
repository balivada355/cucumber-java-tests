Feature: Login Feature
  Verify if user is able to Login in to the site
  @testPico
  Scenario: Login as a authenticated user
    Given user is  on homepage
    When user navigates to Login Page
    And user enters username and Password
    Then success message is displayed

    
  @testPico01 @smoke
  Scenario: Login as a authenticated user_01
    Given user is  on homepage
    When user navigates to Login Page
    And user enters username and Password
    Then success message is displayed
    