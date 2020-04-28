package automation.guru.steps;

import automation.guru.hooks.Hooks;
import automation.guru.hooks.Util;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

/**
 * @author sarathchandrakvn@gmail.com
 */
public class AmazonTest  extends Util {


    @Given("I am open Amazon Webpage$")
    public void navigateToAmazonWebPage()
    {
        webDriver.get("https://www.amazon.com");
        webDriver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

    }


    @And("I search for a \"([^\"]*)\"$")
    public void searchForaProduct(String product)
    {

    }


    @Then("I should see results$")
    public void verifyResults()
    {

    }

}
