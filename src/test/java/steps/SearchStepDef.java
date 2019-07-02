package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driver.DriverFactory;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import pageobject.HomePage;
import pageobject.ResultsPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringWhiteSpace;
import static org.hamcrest.Matchers.is;

public class SearchStepDef extends DriverFactory {

    private HomePage homePage=new HomePage();
    private ResultsPage resultsPage=new ResultsPage();


    @Given("^I am Homepage$")
    public void i_am_Homepage() {
      String actual= homePage.getHomePageUrl();
      assertThat("HomePage might be end with something or user on different page .",actual,Matchers.endsWith("co.uk/"));

    }


    @When("^I search for a product \"([^\"]*)\"$")
    public void i_search_for_a_product(String item1) {
        homePage.doSearch(item1);
    }

    @Then("^I should be able to see the respective results$")
    public void i_should_be_able_to_see_the_respective_results()
    {
       String actual = resultsPage.getProductHeader();
       assertThat("you got some difffernt product. ",actual,is(equalToIgnoringWhiteSpace(HomePage.searchProduct)));
    }

    }
