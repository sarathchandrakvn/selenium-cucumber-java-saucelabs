package runner;

/**
 * @author sarathchandrakvn@gmail.com
 */
 import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/features/",
        plugin = {"pretty", "html:target/cucumber-report", "json:target/cucumber.json"},
        tags = {"@search"},
        glue = "automation.guru")
public class TestRunner {
}
