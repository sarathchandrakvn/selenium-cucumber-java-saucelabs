package automation.guru.hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;


/**
 * @author sarathchandrakvn@gmail.com
 */
public class Hooks extends  Util{

    @Before
    public void setup() throws MalformedURLException,InterruptedException
    {
        /*Capabilities chromeCapabilities = DesiredCapabilities.chrome();
         webDriver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),chromeCapabilities);
        Thread.sleep(100);*/
        MutableCapabilities sauceOptions = new MutableCapabilities();

        ChromeOptions browserOptions = new ChromeOptions();
        browserOptions.setExperimentalOption("w3c", true);
        browserOptions.setCapability("platformName", "Windows 10");
        browserOptions.setCapability("browserVersion", "81.0");
        browserOptions.setCapability("sauce:options", sauceOptions);
        final String URL = "https://sarathkvn:27aae687-cf2f-4e86-90a7-1c7fd21bd0e1@ondemand.saucelabs.com:443/wd/hub";
        webDriver = new RemoteWebDriver(new URL(URL),browserOptions);

    }

     @After
    public void tearDown()
     {
         webDriver.quit();
     }
}
