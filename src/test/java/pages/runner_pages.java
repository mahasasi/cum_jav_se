package pages;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/feature2",
        glue = {"pages"},
        plugin = {"pretty",
                "json:target/pom/JSONReports",
                "junit:target/pom/JunitReports"},
        monochrome = true)
public class runner_pages {

}
