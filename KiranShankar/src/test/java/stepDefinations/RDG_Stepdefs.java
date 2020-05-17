package stepDefinations;
import basePage.BasePage;
import io.cucumber.java.en.*;

import java.util.ArrayList;

public class RDG_Stepdefs {
    private BasePage basePage = new BasePage();
    private ArrayList<String> prevGenDates = new ArrayList<>();

    @Given("^User is on Random date generator page$")
    public void userIsOnRandomDateGeneratorPage() {
        basePage.rdgPgObj.verifyUserIsOnHomepage();
    }

    @Then("^I should be able to view all fields as per UX\\/FSD$")
    public void iShouldBeAbleToViewAllFieldsAsPerUXFSD() {
        basePage.rdgPgObj.verifyRDGuiLayout();
    }

    @When("^I enter date count as \"(.*)\"$")
    public void iEnterDateCountAs(String dateCount) {
        basePage.rdgPgObj.enterDateCount(dateCount);
    }

    @And("^I select output date format as \"(.*)\"$")
    public void iSelectOutputDateFormatAs(String outputDateFormat) {
        basePage.rdgPgObj.selectOutputDateFormat(outputDateFormat);
    }

    @And("^I enter Start date as \"(.*)\"$")
    public void iEnterStartDateAs(String startDate) {
        basePage.rdgPgObj.enterStartDate(startDate);
    }

    @And("^I enter End date as \"(.*)\"$")
    public void iEnterEndDateAs(String endDate) {
        basePage.rdgPgObj.enterEndDate(endDate);
    }

    @And("^I click on RDG")
    public void iClickOnRDG() {
        basePage.rdgPgObj.clickOnRandomDate();
    }

    @Then("^\"(.*)\" random dates should be generated in \"(.*)\" format$")
    public void randomDatesShouldBeGeneratedInFormat(int dateCount, String outputDateFormat) {
        basePage.rdgPgObj.verifyFormatForGeneratedDates(dateCount, outputDateFormat);
    }

    @Then("^Verify \"(.*)\" new random dates are generated$")
    public void verifyNewRandomDatesGenerated(int datesCount) {
        prevGenDates = basePage.rdgPgObj.verifyRandomDates(datesCount, prevGenDates);
    }

}
