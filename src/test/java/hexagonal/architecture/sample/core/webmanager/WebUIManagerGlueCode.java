package hexagonal.architecture.sample.core.webmanager;

import cucumber.api.java.en.Given;
import hexagonal.architecture.sample.core.WebUIManager;

public class WebUIManagerGlueCode {
	private WebUIManager webManager;
	
	@Given("Web UI Manager implements TestManager.")
	public void web_UI_Manager_implements_TestManager() {
	}

	@Given("So that its main behavior should be shared with other Managers.")
	public void so_that_its_main_behavior_should_be_shared_with_other_Managers() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}
	
	@Given("Core capabilities are used to contain WebDriver.")
	public void core_capabilities_are_used_to_contain_WebDriver() {
		webManager = new WebUIManager();
	}

	@Given("WebDriver object is wrapped with WebUIManager.")
	public void webdriver_object_is_wrapper_with_WebUIManager() {
		webManager.useBrowser("Chrome");
	}

	@Given("WebUIManager exposes basic WebDriver functionality.")
	public void webuimanager_exposes_basic_WebDriver_functionality() {
		webManager.openUrl("http://www.google.com");
		webManager.closeWindow();
	}
	
}
