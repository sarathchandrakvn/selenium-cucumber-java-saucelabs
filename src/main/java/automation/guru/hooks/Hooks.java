package automation.guru.hooks;

import cucumber.api.java.Before;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
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
        Capabilities chromeCapabilities = DesiredCapabilities.chrome();
         webDriver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),chromeCapabilities);
        Thread.sleep(100);
     }
}
