package pageobject;

import driver.DriverFactory;
import org.openqa.selenium.By;

public class ResultsPage extends DriverFactory {
    public String getProductHeader(){
        return  driver.findElement(By.cssSelector(".search-title__term")).getText();
    }
}

