package automation.guru.hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariOptions;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;


/**
 * @author sarathchandrakvn@gmail.com
 */
public class Hooks extends  Util{

    String log4jConfigPath = System.getProperty("user.dir") + "/src/main/config/common/log4j.properties";

    @Before
    public void setup() throws MalformedURLException
    {

        /*Capabilities chromeCapabilities = DesiredCapabilities.chrome();
         webDriver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),chromeCapabilities);*/

        if (System.getProperty("webdriver.browser").equalsIgnoreCase("chrome"))
        {
                MutableCapabilities sauceOptions = new MutableCapabilities();
                ChromeOptions browserOptions = new ChromeOptions();
                browserOptions.setExperimentalOption("w3c", System.getProperty("webdriver.w3c"));
                browserOptions.setCapability("platformName", System.getProperty("webdriver.cap.platformName"));
                browserOptions.setCapability("browserVersion", System.getProperty("webdriver.cap.browserVersion"));
                browserOptions.setCapability("sauce:options", sauceOptions);
                final String URL = System.getProperty("webdriver.url");
                webDriver = new RemoteWebDriver(new URL(URL),browserOptions);
        }

        else  if (System.getProperty("webdriver.browser").equalsIgnoreCase("safari"))
        {
            MutableCapabilities sauceOptions = new MutableCapabilities();
            SafariOptions browserOptions = new SafariOptions();
            browserOptions.setCapability("platformName", System.getProperty("webdriver.cap.platformName"));
            browserOptions.setCapability("browserVersion", System.getProperty("webdriver.cap.browserVersion"));
            browserOptions.setCapability("sauce:options", sauceOptions);
            final String URL = System.getProperty("webdriver.url");
            webDriver = new RemoteWebDriver(new URL(URL),browserOptions);
        }

        else  if (System.getProperty("webdriver.browser").equalsIgnoreCase("iphonexs"))
        {
            DesiredCapabilities caps = DesiredCapabilities.iphone();
            caps.setCapability("appiumVersion", System.getProperty("webdriver.appiumVersion"));
            caps.setCapability("deviceName",System.getProperty("webdriver.deviceName"));
            caps.setCapability("deviceOrientation", System.getProperty("webdriver.deviceOrientation"));
            caps.setCapability("platformVersion",System.getProperty("webdriver.platformVersion"));
            caps.setCapability("platformName", System.getProperty("webdriver.cap.platformName"));
            caps.setCapability("browserName", System.getProperty("webdriver.browserName"));
            final String URL = System.getProperty("webdriver.url");
            webDriver = new RemoteWebDriver(new URL(URL),caps);

        }



/*
        DesiredCapabilities caps = DesiredCapabilities.iphone();
        caps.setCapability("appiumVersion", "1.16.0");
        caps.setCapability("deviceName","iPhone X Simulator");
        caps.setCapability("deviceOrientation", "portrait");
        caps.setCapability("platformVersion","13.2");
        caps.setCapability("platformName", "iOS");
        caps.setCapability("browserName", "Safari");
        final String URL = "https://sarathkvn:27aae687-cf2f-4e86-90a7-1c7fd21bd0e1@ondemand.saucelabs.com:443/wd/hub";
        webDriver = new RemoteWebDriver(new URL(URL),caps);*/
    }

     @After
    public void tearDown()
     {
         webDriver.quit();
     }
}
