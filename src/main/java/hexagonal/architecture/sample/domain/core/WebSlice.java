package hexagonal.architecture.sample.domain.core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import hexagonal.architecture.sample.domain.boundary.SUTClient;
import hexagonal.architecture.sample.domain.boundary.SUTSlice;

public class WebSlice implements SUTSlice {
	private By by;
	WebDriver driver;
	private String definedObject;
	private SUTClient sutClient;
	
	@Override
	public void whichRepresents(String criteria) {
		//TODO Pending strategy implementation.
		if(criteria.contentEquals("ID")) {
			by = By.id(definedObject);
		}
	}
	
	@Override
	public Object getSlice() {
		driver = (WebDriver)sutClient.utilizeClient();
		return driver.findElement(by);
	}

	@Override
	public SUTSlice search(String definedObject) {
		this.definedObject = definedObject;
		return this;
	}

	@Override
	public void setSUTClient(SUTClient sutClient) {
		this.sutClient = sutClient;
	}




}
