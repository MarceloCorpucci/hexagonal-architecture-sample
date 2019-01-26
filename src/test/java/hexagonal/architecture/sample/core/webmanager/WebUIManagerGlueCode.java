package hexagonal.architecture.sample.core.webmanager;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import cucumber.api.java.en.Given;
import hexagonal.architecture.sample.domain.core.WebUIManager;

public class WebUIManagerGlueCode {

	@Given("WebUIManager class implements SUTManager.")
	public void webuimanager_class_implements_SUTManager() {
		assertThat(WebUIManager.class.getInterfaces()[0].getName(), equalTo("hexagonal.architecture.sample.domain.core.SUTManager"));
	}
	
	@Given("WebUIManager is an object intended to be a wrapper of WebDriver.")
	public void webuimanager_is_an_object_intended_to_be_a_wrapper_of_WebDriver() throws NoSuchFieldException, SecurityException {
		String wrappedWebDriver = WebUIManager.class.getDeclaredField("driver").getType().toString();
		assertThat(wrappedWebDriver,equalTo("interface org.openqa.selenium.WebDriver"));
	}
	
	@Given("WebUIManager needs to receive a browser type before starting a new one.")
	public void webuimanager_needs_to_receive_a_browser_type_before_starting_a_new_one() throws NoSuchMethodException, SecurityException {
		assertThat(WebUIManager.class.getMethod("useApplication",String.class).getName(), is("useApplication"));
	}

}
