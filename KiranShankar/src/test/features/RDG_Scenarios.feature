@RandomDate
Feature: Random Date Generator Test Scenarios
  As a User I should be able to generate random date based on the selected options

  Background: Open browser
    Given User is on Random date generator page

  Scenario: Verify the UI layout of RDG form
    Then I should be able to view all fields as per UX/FSD


  Scenario Outline: Verify user is able to generate random dates in pre-defined output format
    When I enter date count as "<date_count>"
    And  I select output date format as "<outputDate_Format>"
    And  I enter Start date as "<startDate>"
    And  I enter End date as "<endDate>"
    And  I click on RDG
    Then "<date_count>" random dates should be generated in "<outputDate_Format>" format

    Examples:
    | date_count | outputDate_Format    | startDate  | endDate    |
    | 2          | YYYY-MM-DD hh:mm:ss  | 2020-01-01 | 2021-12-31 |
    | 3          | YYYY-DD-MM hh:mm:ss  | 2020       | 2021       |
    | 5          | MM-DD-YYYY hh:mm:ss  | 2021-01    | 2023-12    |


  Scenario: Verify user is able to generate NEW random dates every time the RDG button is clicked
    When I enter date count as "2"
    And  I select output date format as "YYYY-MM-DD hh:mm:ss"
    And  I enter Start date as "2020-01-01"
    And  I enter End date as "2021-12-31"
    And  I click on RDG
    Then Verify "2" new random dates are generated
    And  I click on RDG
    Then Verify "2" new random dates are generated



