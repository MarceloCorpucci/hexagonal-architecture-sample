package hexagonal.architecture.sample.glue.core;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.endsWith;
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
	
	@Given("It contains the {string} method definition, which accepts a string as parameter representing the path.")
	public void it_contains_the_method_definition_which_accepts_a_string_as_parameter_representing_the_path(String methodName)
											throws NoSuchMethodException, SecurityException {
		assertThat(SUTClient.class.getMethod(methodName, String.class).toString(),
				   endsWith("open(java.lang.String)"));
	}
	
	@Given("It contains the {string} method definition.")
	public void it_contains_the_method_definition(String methodName)
											throws NoSuchMethodException, SecurityException {
		assertThat(SUTClient.class.getMethod(methodName).toString(),
				   endsWith("close()"));
	}
	
	@Given("It contains the {string} method definition, which accepts a string parameter representing the slice to be found.")
	public void it_contains_the_method_definition_which_accepts_a_string_parameter_representing_the_slice_to_be_found(String methodName)
											throws NoSuchMethodException, SecurityException {
		//assertThat(SUTClient.class.getMethod(methodName, SUTSlicePoint.class).toString(),
		//		   endsWith("on(hexagonal.architecture.sample.domain.boundary.SUTSlicePoint"));
	}

	@Given("It contains the {string} method definition, which accepts a string parameter representing the text to be added into the text field.")
	public void it_contains_the_method_definition_which_accepts_a_string_parameter_representing_the_text_to_be_added_into_the_text_field(String methodName)
			throws NoSuchMethodException, SecurityException {
		assertThat(SUTClient.class.getMethod(methodName, String.class).toString(),
				endsWith("addText(java.lang.String)"));
	}
	
	@Given("It is a wrapper of a WebElement, part of the WebDriver API.")
	public void it_is_a_wrapper_of_a_WebElement_part_of_the_WebDriver_API() {
		
	}
	
	@Given("It is a wrapper of a By class, part of the WebDriver API.")
	public void it_is_a_wrapper_of_a_By_class_part_of_the_WebDriver_API() {
	}
	
}
