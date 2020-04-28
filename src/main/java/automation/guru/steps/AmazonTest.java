package automation.guru.steps;

import automation.guru.hooks.Hooks;
import automation.guru.hooks.Util;
import com.google.common.base.Function;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.sql.Time;
import java.util.NoSuchElementException;
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
        waitForElement("twotabsearchtextbox");
        webDriver.findElement(By.id("twotabsearchtextbox")).sendKeys(product);

    }

    private void waitForElement(final String id)
    {
        Wait<WebDriver> wait = new FluentWait<WebDriver>(webDriver)
                .withTimeout(30, TimeUnit.SECONDS)
                .pollingEvery(5, TimeUnit.SECONDS)
                .ignoring(NoSuchElementException.class);

        WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.id(id));
            }
        });
    }


    @Then("I should see results$")
    public void verifyResults()
    {

    }

}
