$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/test.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 18,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 20,
  "name": "Title of your feature",
  "description": "I want to use this template for my feature file",
  "id": "title-of-your-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 19,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "line": 24,
  "name": "Title of your scenario",
  "description": "",
  "id": "title-of-your-feature;title-of-your-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 23,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "user opens Salesforce Login page",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "user enters username and password",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "user clicks on My Accounts tab",
  "keyword": "Given "
});
formatter.step({
  "line": 28,
  "name": "user selects \"Adams, Bob\" from My Accounts list",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "user chooses to record a call",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "Verify the new call page is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "user select \"Mass Add Promo Call\" from the Record Type drop down list",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "user selects following options under Detailing Priority",
  "rows": [
    {
      "cells": [
        "Cholecap",
        "Labrinone"
      ],
      "line": 33
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "user verifies above mentioned options under Call discussion section",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.userOpensSalesforceLoginPage()"
});
formatter.result({
  "duration": 15294551600,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.userEntersUsernameAndPassword()"
});
formatter.result({
  "duration": 12837355201,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.userClicksOnMyAccountsTab()"
});
formatter.result({
  "duration": 859372700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Adams, Bob",
      "offset": 14
    }
  ],
  "location": "MyAccountSteps.selectsFromMyAccountsList(String)"
});
formatter.result({
  "duration": 13069568300,
  "status": "passed"
});
formatter.match({
  "location": "MyAccountSteps.user_chooses_to_record_a_call()"
});
formatter.result({
  "duration": 22696684800,
  "status": "passed"
});
formatter.match({
  "location": "MyAccountSteps.verify_the_new_call_page_is_displayed()"
});
formatter.result({
  "duration": 8579063099,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mass Add Promo Call",
      "offset": 13
    }
  ],
  "location": "MyAccountSteps.user_select_from_the_Record_Type_drop_down_list(String)"
});
formatter.result({
  "duration": 2258549200,
  "status": "passed"
});
formatter.match({
  "location": "MyAccountSteps.theFollowingKeywordsAreHere(String\u003e)"
});
formatter.result({
  "duration": 10665734500,
  "status": "passed"
});
formatter.match({
  "location": "MyAccountSteps.verifies_options_under_Call_discussion()"
});
formatter.result({
  "duration": 363103901,
  "status": "passed"
});
});