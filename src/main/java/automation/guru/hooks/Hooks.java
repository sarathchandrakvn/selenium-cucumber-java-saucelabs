package automation.guru.hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

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
    private static java.util.Properties props;

    @Before
    public void setup() throws MalformedURLException,InterruptedException
    {
/*
        props = new java.util.Properties();
        String pathWithPropertiesFiles = System.getProperty("configuration.path");
        String[] paths = pathWithPropertiesFiles.split("[;]");
        Arrays.asList(paths).forEach(propertyPath -> Arrays.asList(Objects.requireNonNull(new File(propertyPath).listFiles())).forEach(propertyFile -> {
            InputStream input;
            try {
                input = new FileInputStream(propertyFile);
                props.load(input);
            }
            catch (IOException e) {
                throw new RuntimeException(e);
            }
        }));*/

        Capabilities chromeCapabilities = DesiredCapabilities.chrome();
         webDriver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),chromeCapabilities);
 /*
        MutableCapabilities sauceOptions = new MutableCapabilities();

        ChromeOptions browserOptions = new ChromeOptions();
        browserOptions.setExperimentalOption("w3c", true);
        browserOptions.setCapability("platformName", "Windows 10");
        browserOptions.setCapability("browserVersion", "81.0");
        browserOptions.setCapability("sauce:options", sauceOptions);
        final String URL = "https://sarathkvn:27aae687-cf2f-4e86-90a7-1c7fd21bd0e1@ondemand.saucelabs.com:443/wd/hub";
        webDriver = new RemoteWebDriver(new URL(URL),browserOptions);
*/
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
