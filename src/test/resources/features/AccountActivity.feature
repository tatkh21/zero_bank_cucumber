Feature:User is on the Account Activity page and can see different accounts

  Background: Assuming that user is on the Login page
    Given the user is on the login page
    When user enters credentials and logs in
    And user clicks to advanced connection button
    Then user is on the "Account Summary" page

  @wip
  Scenario: Account activity page
    Given user clicks on "Account Activity"
    Then dropdown default value is "Savings"
    And user can see following "dropdown" types
      | Savings     |
      | Checking    |
      | Savings     |
      | Loan        |
      | Credit Card |
      | Brokerage   |
    And user can see following "transaction table" types
      | Date        |
      | Description |
      | Deposit     |
      | Withdrawal  |