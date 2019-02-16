package hexagonal.architecture.sample.domain.core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import hexagonal.architecture.sample.domain.boundary.SUTClient;
import hexagonal.architecture.sample.domain.boundary.SUTSlice;

public class ChromeClient implements SUTClient {
	private WebDriver driver;
	private SUTSlice webSlice;
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
	public SUTClient setSUTSlice(SUTSlice sutSlice) {
		this.webSlice = sutSlice;
		return this;
	}

	@Override
	public SUTClient waitUntilSliceAvailable(String location) {
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated((By)webSlice.getSlicePoint(location)));
		return this;
	}

	@Override
	public SUTClient waitUntilSUTLocationIsReady(String location) {
		new WebDriverWait(driver, 10).until(ExpectedConditions.urlToBe(location));
		return this;
	}
	
	@Override
	public String getSUTLocation() {
		return driver.getCurrentUrl();
	}

	@Override
	public SUTClient addText(String text) {
		element = (WebElement)webSlice.getSlice();
		element.sendKeys(text);
		return this;
	}

	@Override
	public SUTClient select() {
		element = (WebElement)webSlice.getSlice();
		element.click();
		return this;
	}



	
}
