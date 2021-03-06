package hexagonal.architecture.sample.glue.core;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.endsWith;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import cucumber.api.java.en.Given;
import hexagonal.architecture.sample.domain.boundary.SUTSlice;
import hexagonal.architecture.sample.domain.core.ChromeClient;
import hexagonal.architecture.sample.domain.core.WebManager;

public class CoreGlueCode {

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
	
	@Given("It opens an url through the {string} method.")
	public void it_opens_an_url_through_the_method(String methodName) 
											throws NoSuchMethodException {
		assertThat(ChromeClient.class.getMethod(methodName, String.class).toString(),
				   endsWith("open(java.lang.String)"));
	}

	@Given("It closes the browser through the {string} method.")
	public void it_closes_the_browser_through_the_method(String methodName)
											throws NoSuchMethodException {
		assertThat(ChromeClient.class.getMethod(methodName).toString(),
				   endsWith("close()"));
	}
	
	@Given("It enters text into text fields through the {string} method.")
	public void it_enters_text_into_text_fields_through_the_method(String methodName)
											throws NoSuchMethodException {
		assertThat(ChromeClient.class.getMethod(methodName, String.class).toString(),
				   endsWith("addText(java.lang.String)"));
	}
	
	@Given("It exposes the wrapped driver as an object through the method {string}.")
	public void it_exposes_the_wrapped_driver_as_an_object_through_the_method(String methodName)
											throws NoSuchMethodException {
		assertThat(ChromeClient.class.getMethod(methodName).toString(),
				   endsWith(methodName + "()"));
	}
	

	@Given("It allows to compose a SUTSlice through the method {string} receiving a SUTSlice as a parameter.")
	public void it_allows_to_compose_a_SUTSlice_through_the_method_receiving_a_SUTSlice_as_a_parameter(String methodName)
											throws NoSuchMethodException {
		assertThat(ChromeClient.class.getMethod(methodName, SUTSlice.class).toString(),
				   endsWith(methodName + "(hexagonal.architecture.sample.domain.boundary.SUTSlice)"));
	}
}
