package automation.guru.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

/**
 * @author sarathchandrakvn@gmail.com
 */
public class AmazonTest {


    @Given("I am open Amazon Webpage$")
    public void navigateToAmazonWebPage()
    {
        System.out.println("test");
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
