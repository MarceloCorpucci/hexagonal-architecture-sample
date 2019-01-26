package hexagonal.architecture.sample.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", 
				 glue = "hexagonal.architecture.sample", 
				 tags = {"@wip"}, 
				 plugin = {"json:target/cucumber.json" })
public class TestRunner {

}
