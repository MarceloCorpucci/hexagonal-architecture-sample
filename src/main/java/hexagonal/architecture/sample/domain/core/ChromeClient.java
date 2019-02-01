package hexagonal.architecture.sample.domain.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import hexagonal.architecture.sample.domain.boundary.SUTClient;

public class ChromeClient implements SUTClient {
	private WebDriver driver;
	
	public ChromeClient() {
		System.setProperty("webdriver.chrome.driver", "/opt/chromedriver/chromedriver");
		driver = new ChromeDriver();
	}
	
	@Override
	public SUTClient open(String path) {
		driver.get(path);
		return this;
	}

}
