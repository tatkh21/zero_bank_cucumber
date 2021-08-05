Feature:User is on the Account Summary page and can see different accounts

  Background: Assuming that user is on the Login page
    Given the user is on the login page
    When user enters credentials and logs in
    And user clicks to advanced connection button
    Then user is on the "Account Summary" page


  Scenario: Account summary page
    Given user can see following "accounts" types
      | Cash Accounts       |
      | Investment Accounts |
      | Credit Accounts     |
      | Loan Accounts       |
    And user can see following "columns" types
      | Account    |
      | Credit Card |
      | Balance     |

  Scenario: Brokerage account redirect
    Given user clicks on "Brokerage" link user can see "Account Activity" page
    And Account drop down should have "Brokerage" selected


    Scenario: Checking account redirect
      Given user clicks on "Checking" link user can see "Account Activity" page
      And Account drop down should have "Checking" selected
@wip
  Scenario: Credit card account redirect
    Given user clicks on "Credit Card" link user can see "Account Activity" page
    And Account drop down should have "Credit Card" selected
@wip
  Scenario: Loan account redirect
    Given user clicks on "Loan" link user can see "Account Activity" page
    And Account drop down should have "Loan" selected




