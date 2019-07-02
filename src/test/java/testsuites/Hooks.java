package testsuites;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import driver.DriverFactory;

public class Hooks extends DriverFactory {
    private  DriverFactory driverFactory= new DriverFactory();
    @Before
    public void setUp(){
        driverFactory.openBrowser();
        driverFactory.maxBrowser();
        driverFactory.applyImpWait();
    }
    @After
    public void tearDown(){
        driverFactory.closeBrowser();
    }

}
