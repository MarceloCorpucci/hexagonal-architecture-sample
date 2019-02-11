package hexagonal.architecture.sample.domain.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import hexagonal.architecture.sample.domain.boundary.SUTClient;
import hexagonal.architecture.sample.domain.boundary.SUTSlice;

public class ChromeClient implements SUTClient {
	private WebDriver driver;
	private SUTSlice webSlicePoint;
	private WebElement element;
	
	public ChromeClient() {
		System.setProperty("webdriver.chrome.driver", "/Users/marcelocorpucci/Chromedriver/chromedriver");
		driver = new ChromeDriver();
	}
	
	@Override
	public SUTClient open(String path) {
		driver.get(path);
		return this;
	}

	@Override
	public SUTClient close() {
		driver.close();
		return this;
	}

	@Override
	public Object utilizeClient() {
		return this.driver;
	}

	@Override
	public SUTClient getSUTSlice(SUTSlice sutSlice) {
		this.webSlicePoint = sutSlice;
		return this;
	}

	@Override
	public SUTClient addText(String text) {
		element = (WebElement)webSlicePoint.getSlice();
		element.sendKeys(text);
		return this;
	}


	
}
