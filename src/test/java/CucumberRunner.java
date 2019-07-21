import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/"}, glue = {"raiffeisen"},
        plugin = {"json:target/cucumber-report.json",
                  "pretty",
                  "html:target/cucumber-reports"},
        tags = {"@Test"})
public class CucumberRunner {
}
