package automation.guru.hooks;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.JavascriptExecutor;
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
public class Hooks extends Util{


    @Before
    public void setup(Scenario scenario) throws MalformedURLException {
         String gridLocation = System.getProperty("webdriver.url");


        if (System.getProperty("webdriver.browser").equalsIgnoreCase("localchrome")) {
            Capabilities chromeCapabilities = DesiredCapabilities.chrome();
            webDriver = new RemoteWebDriver(new URL(System.getProperty("webdriver.url")), chromeCapabilities);
        }


        if (gridLocation != null && gridLocation.contains("saucelabs")) {
            String featureName = scenario.getId().split(";")[0];


            if (System.getProperty("webdriver.browser").equalsIgnoreCase("chrome")) {
                MutableCapabilities sauceOptions = new MutableCapabilities();
                ChromeOptions browserOptions = new ChromeOptions();
                browserOptions.setExperimentalOption("w3c", System.getProperty("webdriver.w3c"));
                browserOptions.setCapability("platformName", System.getProperty("webdriver.cap.platformName"));
                browserOptions.setCapability("browserVersion", System.getProperty("webdriver.cap.browserVersion"));
                browserOptions.setCapability("build", featureName + "  " + System.currentTimeMillis());
                browserOptions.setCapability("name", scenario.getName());
                browserOptions.setCapability("sauce:options", sauceOptions);
                final String URL = System.getProperty("webdriver.url");
                webDriver = new RemoteWebDriver(new URL(URL), browserOptions);

            } else if (System.getProperty("webdriver.browser").equalsIgnoreCase("safari")) {
                MutableCapabilities sauceOptions = new MutableCapabilities();
                SafariOptions browserOptions = new SafariOptions();
                browserOptions.setCapability("platformName", System.getProperty("webdriver.cap.platformName"));
                browserOptions.setCapability("browserVersion", System.getProperty("webdriver.cap.browserVersion"));
                browserOptions.setCapability("build", featureName + "  " + System.currentTimeMillis());
                browserOptions.setCapability("name", scenario.getName());
                browserOptions.setCapability("sauce:options", sauceOptions);
                final String URL = System.getProperty("webdriver.url");
                webDriver = new RemoteWebDriver(new URL(URL), browserOptions);

            } else if (System.getProperty("webdriver.browser").equalsIgnoreCase("iphonexs")) {
                DesiredCapabilities caps = DesiredCapabilities.iphone();
                caps.setCapability("appiumVersion", System.getProperty("webdriver.appiumVersion"));
                caps.setCapability("deviceName", System.getProperty("webdriver.deviceName"));
                caps.setCapability("deviceOrientation", System.getProperty("webdriver.deviceOrientation"));
                caps.setCapability("platformVersion", System.getProperty("webdriver.platformVersion"));
                caps.setCapability("platformName", System.getProperty("webdriver.cap.platformName"));
                caps.setCapability("browserName", System.getProperty("webdriver.browserName"));
                caps.setCapability("build", featureName + "  " + System.currentTimeMillis());
                caps.setCapability("name", scenario.getName());
                final String URL = System.getProperty("webdriver.url");
                webDriver = new RemoteWebDriver(new URL(URL), caps);

            } else if (System.getProperty("webdriver.browser").equalsIgnoreCase("samsung")) {
                DesiredCapabilities caps = DesiredCapabilities.iphone();
                caps.setCapability("appiumVersion", System.getProperty("webdriver.appiumVersion"));
                caps.setCapability("deviceName", System.getProperty("webdriver.deviceName"));
                caps.setCapability("deviceOrientation", System.getProperty("webdriver.deviceOrientation"));
                caps.setCapability("platformVersion", System.getProperty("webdriver.platformVersion"));
                caps.setCapability("platformName", System.getProperty("webdriver.cap.platformName"));
                caps.setCapability("browserName", System.getProperty("webdriver.browserName"));
                caps.setCapability("build", featureName + "  " + System.currentTimeMillis());
                caps.setCapability("name", scenario.getName());
                final String URL = System.getProperty("webdriver.url");
                webDriver = new RemoteWebDriver(new URL(URL), caps);
            }
        }
    }

     @After
    public void tearDown()
     {
         webDriver.quit();
     }
}
