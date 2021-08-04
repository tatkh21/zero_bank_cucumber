Feature:User is on the Pay Bills page and can see different accounts

  Background: Assuming that user is on the Login page
    Given the user is on the login page
    When user enters credentials and logs in
    And user clicks to advanced connection button
    Then user is on the "Account Summary" page

  Scenario: Pay Bills page Successful payment
    Given user clicks on "Pay Bills"
    And user enters "100" amount and date
    Then "The payment was successfully submitted." messsage appear

  Scenario: Pay Bills page unsuccessful payment
    Given user clicks on "Pay Bills"
    Given user enters "" amount and date
    Then "Please fill out this field." messsage appear
