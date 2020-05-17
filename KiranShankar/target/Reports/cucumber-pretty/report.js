$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/features/RDG_Scenarios.feature");
formatter.feature({
  "name": "Random Date Generator Test Scenarios",
  "description": "  As a User I should be able to generate random date based on the selected options",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@RandomDate"
    }
  ]
});
formatter.background({
  "name": "Open browser",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Random date generator page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinations.RDG_Stepdefs.userIsOnRandomDateGeneratorPage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify the UI layout of RDG form",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@RandomDate"
    }
  ]
});
formatter.step({
  "name": "I should be able to view all fields as per UX/FSD",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinations.RDG_Stepdefs.iShouldBeAbleToViewAllFieldsAsPerUXFSD()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Verify user is able to generate random dates in pre-defined output format",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I enter date count as \"\u003cdate_count\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "I select output date format as \"\u003coutputDate_Format\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "I enter Start date as \"\u003cstartDate\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "I enter End date as \"\u003cendDate\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "I click on RDG",
  "keyword": "And "
});
formatter.step({
  "name": "\"\u003cdate_count\u003e\" random dates should be generated in \"\u003coutputDate_Format\u003e\" format",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "date_count",
        "outputDate_Format",
        "startDate",
        "endDate"
      ]
    },
    {
      "cells": [
        "2",
        "YYYY-MM-DD hh:mm:ss",
        "2020-01-01",
        "2021-12-31"
      ]
    },
    {
      "cells": [
        "3",
        "YYYY-DD-MM hh:mm:ss",
        "2020",
        "2021"
      ]
    },
    {
      "cells": [
        "5",
        "MM-DD-YYYY hh:mm:ss",
        "2021-01",
        "2023-12"
      ]
    }
  ]
});
formatter.background({
  "name": "Open browser",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Random date generator page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinations.RDG_Stepdefs.userIsOnRandomDateGeneratorPage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify user is able to generate random dates in pre-defined output format",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@RandomDate"
    }
  ]
});
formatter.step({
  "name": "I enter date count as \"2\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinations.RDG_Stepdefs.iEnterDateCountAs(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select output date format as \"YYYY-MM-DD hh:mm:ss\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinations.RDG_Stepdefs.iSelectOutputDateFormatAs(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter Start date as \"2020-01-01\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinations.RDG_Stepdefs.iEnterStartDateAs(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter End date as \"2021-12-31\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinations.RDG_Stepdefs.iEnterEndDateAs(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on RDG",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinations.RDG_Stepdefs.iClickOnRDG()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"2\" random dates should be generated in \"YYYY-MM-DD hh:mm:ss\" format",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinations.RDG_Stepdefs.randomDatesShouldBeGeneratedInFormat(int,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "Open browser",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Random date generator page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinations.RDG_Stepdefs.userIsOnRandomDateGeneratorPage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify user is able to generate random dates in pre-defined output format",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@RandomDate"
    }
  ]
});
formatter.step({
  "name": "I enter date count as \"3\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinations.RDG_Stepdefs.iEnterDateCountAs(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select output date format as \"YYYY-DD-MM hh:mm:ss\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinations.RDG_Stepdefs.iSelectOutputDateFormatAs(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter Start date as \"2020\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinations.RDG_Stepdefs.iEnterStartDateAs(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter End date as \"2021\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinations.RDG_Stepdefs.iEnterEndDateAs(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on RDG",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinations.RDG_Stepdefs.iClickOnRDG()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"3\" random dates should be generated in \"YYYY-DD-MM hh:mm:ss\" format",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinations.RDG_Stepdefs.randomDatesShouldBeGeneratedInFormat(int,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "Open browser",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Random date generator page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinations.RDG_Stepdefs.userIsOnRandomDateGeneratorPage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify user is able to generate random dates in pre-defined output format",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@RandomDate"
    }
  ]
});
formatter.step({
  "name": "I enter date count as \"5\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinations.RDG_Stepdefs.iEnterDateCountAs(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select output date format as \"MM-DD-YYYY hh:mm:ss\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinations.RDG_Stepdefs.iSelectOutputDateFormatAs(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter Start date as \"2021-01\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinations.RDG_Stepdefs.iEnterStartDateAs(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter End date as \"2023-12\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinations.RDG_Stepdefs.iEnterEndDateAs(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on RDG",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinations.RDG_Stepdefs.iClickOnRDG()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"5\" random dates should be generated in \"MM-DD-YYYY hh:mm:ss\" format",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinations.RDG_Stepdefs.randomDatesShouldBeGeneratedInFormat(int,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "Open browser",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Random date generator page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinations.RDG_Stepdefs.userIsOnRandomDateGeneratorPage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify user is able to generate NEW random dates every time the RDG button is clicked",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@RandomDate"
    }
  ]
});
formatter.step({
  "name": "I enter date count as \"2\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinations.RDG_Stepdefs.iEnterDateCountAs(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select output date format as \"YYYY-MM-DD hh:mm:ss\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinations.RDG_Stepdefs.iSelectOutputDateFormatAs(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter Start date as \"2020-01-01\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinations.RDG_Stepdefs.iEnterStartDateAs(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter End date as \"2021-12-31\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinations.RDG_Stepdefs.iEnterEndDateAs(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on RDG",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinations.RDG_Stepdefs.iClickOnRDG()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify \"2\" new random dates are generated",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinations.RDG_Stepdefs.verifyNewRandomDatesGenerated(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on RDG",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinations.RDG_Stepdefs.iClickOnRDG()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify \"2\" new random dates are generated",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinations.RDG_Stepdefs.verifyNewRandomDatesGenerated(int)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});