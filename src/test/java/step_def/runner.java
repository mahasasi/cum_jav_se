package step_def;


import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"step_def"},
        plugin = {"pretty",
                "html:target/htmlReports.html",
                "json:target/JSONReports",
                "junit:target/JunitReports"},
        monochrome = true)

public class runner {

}
