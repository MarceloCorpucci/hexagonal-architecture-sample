package hexagonal.architecture.sample.core.webmanager;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import cucumber.api.java.en.Given;
import hexagonal.architecture.sample.domain.boundary.OpenApplicationCommand;

public class CommandsGlueCode {
	@Given("It is meant to open different types of applications.")
	public void it_is_meant_to_open_different_types_of_applications() throws NoSuchMethodException, SecurityException {
		assertThat(OpenApplicationCommand.class.getPackage().getName(), 
					equalTo("hexagonal.architecture.sample.domain.boundary"));
		
	}
}
