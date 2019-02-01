package hexagonal.architecture.sample.glue.core;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import cucumber.api.java.en.Given;
import hexagonal.architecture.sample.domain.core.ChromeClient;
import hexagonal.architecture.sample.domain.core.WebManager;

public class WebManagerGlueCode {

	@Given("Implements SUTManager.")
	public void webmanager_class_implements_SUTManager() {
		assertThat(WebManager.class.getInterfaces()[0].getName(), 
				   equalTo("hexagonal.architecture.sample.domain.boundary.SUTManager"));
	}
	
	@Given("It is in charge of returning a concrete SUTClient according to the application type received.")
	public void webmanager_is_in_charge_of_returning_a_concrete_SUTClient_according_to_the_application_type_received() 
																			throws NoSuchMethodException, SecurityException {
		assertThat(WebManager.class.getMethod("useApplication",String.class).getName(), 
				   is("useApplication"));
	}

	@Given("Implements SUTClients.")
	public void implements_SUTClients() {
		assertThat(ChromeClient.class.getInterfaces()[0].getName(), 
				   equalTo("hexagonal.architecture.sample.domain.boundary.SUTClient"));
	}

	@Given("Is a wrapper of a ChromeDriver object.")
	public void is_a_wrapper_of_a_ChromeDriver_object() 
										throws NoSuchFieldException, SecurityException {
		assertThat(ChromeClient.class.getDeclaredField("driver").toString(),
				   equalTo("private org.openqa.selenium.WebDriver " +
						   "hexagonal.architecture.sample.domain.core.ChromeClient.driver"));
	}
}
