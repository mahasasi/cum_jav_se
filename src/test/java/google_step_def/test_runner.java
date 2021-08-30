package google_step_def;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/feature1",
        glue = {"google_step_def"},
        plugin = {"pretty",
                "html:target/googleSearch/htmlReports.html",
                "json:target/googleSearch/JSONReports",
                "junit:target/googleSearch/JunitReports"},
        monochrome = true)
public class test_runner {

}
