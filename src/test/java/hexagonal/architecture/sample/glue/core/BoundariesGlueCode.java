package hexagonal.architecture.sample.glue.core;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import cucumber.api.java.en.Given;
import hexagonal.architecture.sample.domain.boundary.SUTClient;
import hexagonal.architecture.sample.domain.boundary.SUTManager;

public class BoundariesGlueCode {
	@Given("SUTManager is in charge of defining the SUTClient to be employed according to the application type.")
	public void sutmanager_is_in_charge_of_defining_the_SUTClient_to_be_employed_according_to_the_application_type() 
																		throws NoSuchMethodException, SecurityException {
		assertThat(SUTManager.class.getMethod("useApplication", String.class).getName(), 
					equalTo("useApplication"));
	}
	
	@Given("SUTClient is in charge of wrapping different types of actions which make possible to connect all test cases to a SUT.")
	public void sutclient_is_in_charge_of_wrapping_different_types_of_actions_which_make_possible_to_connect_all_test_cases_to_a_SUT()
																							throws NoSuchMethodException, SecurityException {
		assertThat(SUTClient.class.getMethod("open", String.class).getName(), 
				equalTo("open"));
	}
}
