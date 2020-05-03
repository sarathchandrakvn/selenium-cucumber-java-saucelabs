package automation.guru.steps;

import automation.guru.hooks.Util;
import com.google.common.base.Function;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

/**
 * @author sarathchandrakvn@gmail.com
 */
public class AmazonTest  extends Util {

    boolean isMobile ;
    private static Logger logger;

    @Given("I am open Amazon Webpage$")
    public void navigateToAmazonWebPage()
    {
        logger = Logger.getLogger(AmazonTest.class);
        isMobile = Boolean.parseBoolean(System.getProperty("webdriver.mobile"));
        webDriver.get("https://www.amazon.com");
        webDriver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
     }


    @And("I search for a \"([^\"]*)\"$")
    public void searchForaProduct(String product)
    {
        if(isMobile)
            waitForElement("//*[@id='nav-search-keywords']");
        else
            waitForElement("//*[@id='twotabsearchtextbox']");

            String xpath = (isMobile == Boolean.TRUE) ? "//*[@id='nav-search-keywords']" : "//*[@id='twotabsearchtextbox']";
            waitForElement(xpath);
            webDriver.findElement(By.xpath(xpath)).sendKeys(product);
    }

    private void waitForElement(final String xpath)
    {
        Wait<WebDriver> wait = new FluentWait<WebDriver>(webDriver)
                .withTimeout(30, TimeUnit.SECONDS)
                .pollingEvery(5, TimeUnit.SECONDS)
                .ignoring(NoSuchElementException.class);

        WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.xpath(xpath));
            }
        });
    }


    @Then("I should see results$")
    public void verifyResults() throws InterruptedException
    {
        String xpath = (isMobile == Boolean.TRUE) ? "//*[@id=nav-search-form]/div[2]/div/input" : "//*[@id='nav-search']/form/div[2]/div/input";
        waitForElement(xpath);
        webDriver.findElement(By.xpath(xpath)).click();
        webDriver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
        Thread.sleep(10);
     }

}
