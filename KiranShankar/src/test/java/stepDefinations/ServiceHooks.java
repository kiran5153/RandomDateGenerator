package stepDefinations;

import io.cucumber.java.*;
import org.openqa.selenium.WebDriver;
import utilities.DriverFactory;

import static utilities.DriverFactory.setWebDriver;

public class ServiceHooks extends DriverFactory {

    @Before ("@RandomDate")
    public void setup() {
        WebDriver driver = initWebDriver();
        if (driver!=null) {
            setWebDriver(driver);
        }else {
            throw new RuntimeException("Unable to produce the driver");
        }
    }

    @After("@RandomDate")
    public void tearDown() {
        tearDownDrivers();
    }

}
