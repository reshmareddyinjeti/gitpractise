package pageobject;

import driver.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends DriverFactory {
    public static String searchProduct;
    @FindBy(id = "searchTerm")
    private WebElement searchTextBox;

    @FindBy(css = "._2mKaC")
    private WebElement magnifierGlass;

    public void doSearch(String item1) {

        searchTextBox.sendKeys(item1);
        magnifierGlass.click();
    }

    //assertion
    public String getHomePageUrl() {
        return driver.getCurrentUrl();
    }

}
