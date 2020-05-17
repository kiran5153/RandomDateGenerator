package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.File;
import java.io.FileInputStream;
import java.util.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public class GenericUtility {
    private WebDriver driver;
    private static int pageTimeout = Integer.parseInt(readConfigs("pageTimeout"));

    public GenericUtility(){
        driver = DriverFactory.getWebDriver();
    }

    public static String readConfigs(String property) {
        String propValue=null;
        try {
            Properties props = new Properties();
            File fs = new File(new File("src"), "/test/resources/Config.properties");
            FileInputStream fis = new FileInputStream(fs.getAbsoluteFile());
            props.load(fis);
            propValue = props.getProperty(property);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return propValue;
    }

    public void waitForPageLoad(){
        try{
            WebDriverWait wait = new WebDriverWait(driver, pageTimeout);
            wait.until((ExpectedCondition<Boolean>) webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
        }catch (Exception e){
            e.printStackTrace();
            throw e;
        }
    }

    public Boolean selectDropdownOption(WebElement webelement, String dropdownOption){
        try {
            Select sel = new Select(webelement);
            List<WebElement> options = sel.getOptions();
            for (int i = 0; i < options.size(); i++) {
                String val = options.get(i).getText();

                if (dropdownOption.trim().equalsIgnoreCase(options.get(i).getText().trim())) {
                    options.get(i).click();
                    return true;
                }
            }
            return false;
        }catch (Exception e){
            e.printStackTrace();
            throw e;
        }
    }

    public ArrayList<String> getGeneratedDates(WebElement element){
        try{
            JavascriptExecutor js = (JavascriptExecutor) DriverFactory.getWebDriver();
            String script = "return arguments[0].value;";
            String randomDates = (String) js.executeScript(script, element);
            String[] datesArr = randomDates.split("\n");
            ArrayList<String> datesLst = new ArrayList<>(Arrays.asList(datesArr));
            return datesLst;
        }catch (Exception e){
            e.printStackTrace();
            throw e;
        }
    }

    public boolean validateDateFormat(String date, String dateformat)
    {
        // For example MM-dd-yyyy, MM.dd.yyyy,dd.MM.yyyy etc.
        dateformat = dateformat.toLowerCase().replace("hh", "HH");
        SimpleDateFormat sdFormat = new SimpleDateFormat(dateformat);
        sdFormat.setLenient(false);
        try
        {
            Date javaDate = sdFormat.parse(date);
            return true;
        } catch (ParseException e)
        {
            return false;
        }
    }


}

