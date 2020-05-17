
package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import utilities.DriverFactory;
import utilities.GenericUtility;
import java.util.ArrayList;

public class RandomDateGenerator  {

    GenericUtility genericUtility;
    public RandomDateGenerator () {
        PageFactory.initElements(DriverFactory.getWebDriver(), this);
        genericUtility = new GenericUtility();
    }

//********************************OBJECTS*********************************************

    @FindBy(css = "#subTitle")
    private WebElement pageTitle;

    @FindBy(css = "#option-count-147fe348")
    private WebElement dateCount_input;

    @FindBy(css = "#option-format-147fe348")
    private WebElement outputDateFormat_drpdwn;

    @FindBy(css = "#option-custom-format-147fe348")
    private WebElement customDateFormat_input;

    @FindBy(css = "#option-start-147fe348")
    private WebElement startDate_input;

    @FindBy(css = "#option-end-147fe348")
    private WebElement endDate_input;

    @FindBy(css = ".btn1.btn-large.generatejson")
    private WebElement genRandomDate_Btn;

    @FindBy(css = ".data.randomjson")
    private WebElement outputTextArea;

    @FindBy(css = "#favToolImg")
    private WebElement addToFav;

    @FindBy(css = "#plinkBtn")
    private WebElement saveAndShare_Btn;

    @FindBy(xpath = "//span[@class='option-group-legend' and text()='Calendar Date Options']")
    private WebElement calDateOption_Label;

    @FindBy(xpath = "//label[@for='option-count-147fe348' and text()='How many dates to generate?']")
    private WebElement noOfdates_Label;

    @FindBy(xpath = "//label[@for='option-format-147fe348' and text()='Date Output Format']")
    private WebElement dateOutputFormat_Label;

    @FindBy(xpath = "//label[@for='option-custom-format-147fe348' and text()='Custom date format Use: YYYY YY MM month mon DD d hh h mm m ss s']")
    private WebElement customDateFormat_Label;

    @FindBy(xpath = "//label[@for='option-start-147fe348' and text()='Start date']")
    private WebElement startDate_Label;

    @FindBy(xpath = "//label[@for='option-end-147fe348' and text()='End date']")
    private WebElement endDate_Label;


    @FindBy(css = ".option-group-legend")
    private WebElement sampleText;


//**********************************METHODS*****************************************

    public void verifyUserIsOnHomepage() {
        try {
            genericUtility.waitForPageLoad();
            Assert.assertTrue("Failed to load 'Random Date Generator' page", pageTitle.isDisplayed());
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public  void verifyRDGuiLayout (){
        try {
            Assert.assertTrue("'Random Date Generator' page title is not present in RDG form", pageTitle.isDisplayed());
            Assert.assertTrue("'Add to Favorite' is not present in RDG form", addToFav.isDisplayed());
            Assert.assertTrue("'Save & Share' is not present in RDG form", saveAndShare_Btn.isDisplayed());
            Assert.assertTrue("'Generate Random date' button is not present in RDG form", genRandomDate_Btn.isDisplayed());
            Assert.assertTrue("'Output Test area' is not present in RDG form", outputTextArea.isDisplayed());
            Assert.assertTrue("'No. of dates' input is not present in RDG form", dateCount_input.isDisplayed());
            Assert.assertTrue("'Custom date format' input is not present in RDG form", customDateFormat_input.isDisplayed());
            Assert.assertTrue("'Output date format' dropdown is not present in RDG form", outputDateFormat_drpdwn.isDisplayed());
            Assert.assertTrue("'Start date' input is not present in RDG form", startDate_input.isDisplayed());
            Assert.assertTrue("'End  date' input is not present in RDG form", endDate_input.isDisplayed());
            //labels
            Assert.assertTrue("'Calendar Date Options' label is not present in RDG form", calDateOption_Label.isDisplayed());
            Assert.assertTrue("'No. of dates' label is not present in RDG form", noOfdates_Label.isDisplayed());
            Assert.assertTrue("'Custom date format' label is not present in RDG form", customDateFormat_Label.isDisplayed());
            Assert.assertTrue("'Output date format' label is not present in RDG form", dateOutputFormat_Label.isDisplayed());
            Assert.assertTrue("'Start date' label is not present in RDG form", startDate_Label.isDisplayed());
            Assert.assertTrue("'End date' label is not present in RDG form", endDate_Label.isDisplayed());
        }catch (Exception e){
            e.printStackTrace();
            throw e;
        }
    }

    public  void enterDateCount (String dateCount){
        try {
            dateCount_input.clear();
            dateCount_input.sendKeys(dateCount);
        }catch (Exception e){
            e.printStackTrace();
            throw e;
        }
    }

    public  void selectOutputDateFormat (String outputDateFormat){
        try {
            boolean isfound = genericUtility.selectDropdownOption(outputDateFormat_drpdwn, outputDateFormat);
            Assert.assertTrue(outputDateFormat +": output date format was not found in dropdown options", isfound);
        }catch (Exception e){
            e.printStackTrace();
            throw e;
        }
    }

    public  void enterStartDate (String startDate){
        try {
            startDate_input.clear();
            startDate_input.sendKeys(startDate);
        }catch (Exception e){
            e.printStackTrace();
            throw e;
        }
    }

    public  void enterEndDate (String endDate){
        try {
            endDate_input.clear();
            endDate_input.sendKeys(endDate);
        }catch (Exception e){
            e.printStackTrace();
            throw e;
        }
    }

    public  void clickOnRandomDate (){
        try {
            genRandomDate_Btn.click();
            genericUtility.waitForPageLoad();
        }catch (Exception e){
            e.printStackTrace();
            throw e;
        }
    }

    public  void verifyFormatForGeneratedDates(int dateCount, String outputDateFormat){
        try {
            ArrayList<String> datesLst= genericUtility.getGeneratedDates(outputTextArea);
            Assert.assertTrue("'Failed to generate random dates. Expected: " + dateCount +
                    ", Actual: " + datesLst.size(), datesLst.size() == dateCount);

            for (int i=0; i<datesLst.size(); i++){
                boolean validFormat = genericUtility.validateDateFormat(datesLst.get(i), outputDateFormat);
                Assert.assertTrue("Invaid date format generated for output '" + outputDateFormat +
                        "', and date: " + datesLst.get(i), validFormat);
            }
        }catch (Exception e){
            e.printStackTrace();
            throw e;
        }
    }

    public  ArrayList<String> verifyRandomDates(int dateCount, ArrayList<String> prevGenDates){
        try {
            ArrayList<String> datesLst= genericUtility.getGeneratedDates(outputTextArea);
            Assert.assertTrue("'Failed to generate random dates. Expected: " + dateCount +
                    ", Actual: " + datesLst.size(), datesLst.size() == dateCount);

            if (! prevGenDates.isEmpty()){
                Assert.assertTrue("'Mismatch is dates count from previous to current generated dates. Expected: "
                        + prevGenDates + ", Actual: " + datesLst.size(), datesLst.size() == prevGenDates.size());

//                datesLst.equals(prevGenDates);
                for (int i =0; i<datesLst.size(); i++){
                    Assert.assertTrue("Failed to generate new random date. Previous generated is same as newly " +
                                    "generated date. Previous Date: " + prevGenDates.get(i)  +", Current Date: " + datesLst.get(i),
                            datesLst.get(i).toString() != prevGenDates.get(i).toString());
                }
            }
            return datesLst;
        }catch (Exception e){
            e.printStackTrace();
            throw e;
        }
    }


}
