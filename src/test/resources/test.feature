#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Title of your scenario
    Given user opens Salesforce Login page
    When user enters username and password
    Given user clicks on My Accounts tab
    When user selects "Adams, Bob" from My Accounts list
    When user chooses to record a call
    Then Verify the new call page is displayed
    When user select "Mass Add Promo Call" from the Record Type drop down list
    And user selects following options under Detailing Priority
	  | Cholecap | Labrinone |
	  Then user verifies above mentioned options under Call discussion section
	  When user selects the check box "QNASL Co-Pay Card Alt Sample" and change quantity to "2"
	  And user clicks on save button
	  Then user logs out of the saleforce application