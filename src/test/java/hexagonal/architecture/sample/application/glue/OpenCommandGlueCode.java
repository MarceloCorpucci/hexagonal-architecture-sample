package hexagonal.architecture.sample.application.glue;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import cucumber.api.java.en.Given;
import hexagonal.arquitecture.sample.application.OpenWebCommand;

public class OpenCommandGlueCode {
	@Given("It calls the {string} method from WebUIManager.")
	public void it_calls_the_method_from_WebUIManager(String string) throws NoSuchFieldException, SecurityException {
		assertThat(OpenWebCommand.class.getDeclaredField("webUIManager").getType().toString(), equalTo("interface hexagonal.architecture.sample.domain.core.SUTManager"));
	}
}
