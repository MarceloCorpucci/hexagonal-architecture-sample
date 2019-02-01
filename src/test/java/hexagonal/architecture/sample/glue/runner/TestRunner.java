package hexagonal.architecture.sample.glue.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", 
				 glue = "hexagonal.architecture.sample.glue", 
				 tags = {"@wip"}, 
				 plugin = {"json:target/cucumber.json" })
public class TestRunner {

}
