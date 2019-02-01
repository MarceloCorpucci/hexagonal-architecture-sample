package hexagonal.architecture.sample.glue.application;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import cucumber.api.java.en.Given;
import hexagonal.architecture.sample.application.WebPort;

public class PortsGlueCode {
	@Given("It contains the method {string}, and it returns a SUTClient.")
	public void it_contains_the_method_and_it_returns_a_SUTClient(String methodName) 
											throws NoSuchMethodException, SecurityException {
		assertThat(WebPort.class.getMethod(methodName,String.class).getReturnType().toString(), 
				   is("interface hexagonal.architecture.sample.domain.boundary.SUTClient"));
	}
}
