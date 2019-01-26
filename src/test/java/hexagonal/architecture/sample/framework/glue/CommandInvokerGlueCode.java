package hexagonal.architecture.sample.framework.glue;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import cucumber.api.java.en.Given;
import hexagonal.architecture.sample.framework.OpenWebCommandExecutor;

public class CommandInvokerGlueCode {
	@Given("The object {string} decouples the command from its consumers.")
	public void the_object_decouples_the_command_from_its_consumers(String string) 
			throws NoSuchFieldException, SecurityException {
		assertThat(OpenWebCommandExecutor
						.class
						.getDeclaredField("openApplicationCommands")
						.getDeclaringClass()
						.toString(),
					equalTo("class hexagonal.architecture.sample.framework.OpenWebCommandExecutor"));
	}
}
