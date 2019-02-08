package hexagonal.architecture.sample.domain.core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import hexagonal.architecture.sample.domain.boundary.SUTClient;
import hexagonal.architecture.sample.domain.boundary.SUTSlice;

public class ChromeClient implements SUTClient {
	private WebDriver driver;
	private SUTSlice slicePoint;
	
	public ChromeClient() {
		System.setProperty("webdriver.chrome.driver", "/opt/chromedriver/chromedriver");
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

//	@Override
//	public SUTSlice takeSlice(SUTSlicePoint slicePoint) {
//		return new SUTSlice().driver.findElement(slicePoint);
//	}

	@Override
	public SUTClient on(SUTSlice slicePoint) {
		By by = (By)slicePoint;
		slicePoint = (SUTSlice)driver.findElement(by);
		return this;
	}

	@Override
	public SUTClient addText(String text) {
		WebElement element = (WebElement)slicePoint;
		element.sendKeys(text);
		return this;
	}
	
}
