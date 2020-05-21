Feature: Login to Salesforce application

  Background:
    Given user opens Salesforce Login page
    When user enters username and password

  @Testing
  Scenario: Navigate to an account to record a call
    Then user is in Salesforce Homepage
    Given user clicks on My Accounts tab
    When user selects "Adams, Bob" from My Accounts list
#    And user is on User Account page
#    And click on "Record a Call" button
#    Then validate the call report page is displayed
#    When user clicks on Record Type drop down
#    And select "Mass Add Promo Call" from the list
#    And select Cholecap and Labrinone in Detail Priority section
#    Then validate that Call Discussions section has both Cholecap and Labrinone in the order selected
#    And validate that Product 1 dropdown has Cholecap and Product 2 has Labrinone
#    When user selects "QNASL Co-Pay Card" in Samples and Promotional Items section
#    And change the quantity to "2"
#    And user clicks on save button
#    And user validates for successful submission
#    Then user logs out from the application successfully



