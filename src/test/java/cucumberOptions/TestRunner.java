package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty", "html:target/cucumber_results", "json:target/result.json", "junit:target/result.xml"},
		features = "src/test/java/features",
//		dryRun = true,
		monochrome = true,
//		strict = true,
		glue = "stepDefinations"
//		tags = "@TestNo.2"
		)

public class TestRunner {

}
