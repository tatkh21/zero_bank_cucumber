Feature: Online banking login

  Background: Assuming that user is on the Login page
    Given the user is on the login page


  Scenario: authorized user should be able to login with valid credentials
    When user enters credentials and logs in
    And user clicks to advanced connection button
    Then user is on the "Account Summary" page

    Scenario: user should not be able to login with invalid credentials
      When user login with "123" username and "123" password "Login and/or password are wrong." appear

  Scenario: user should not be able to login with empty password and username fields
    When user login with "" username and "" password "Login and/or password are wrong." appear


