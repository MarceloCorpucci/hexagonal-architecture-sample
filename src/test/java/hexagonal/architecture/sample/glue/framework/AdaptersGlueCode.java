package hexagonal.architecture.sample.glue.framework;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import cucumber.api.java.en.Given;
import hexagonal.architecture.sample.framework.WebAdapter;

public class AdaptersGlueCode {
	@Given("It implements WebPort.")
	public void it_implements_WebPort() {
		assertThat(WebAdapter.class.getInterfaces()[0].getName(), 
				   equalTo("hexagonal.architecture.sample.application.WebPort"));
	}
	
	// * It contains the method "open", and it returns a SUTClient.
	// implemented in PortsGlueCode.java
}
