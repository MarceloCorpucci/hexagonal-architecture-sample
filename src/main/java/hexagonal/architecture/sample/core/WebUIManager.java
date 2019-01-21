package hexagonal.architecture.sample.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebUIManager {
	private WebDriver driver;

	public WebUIManager useBrowser(String browser) {
		// TODO Factory needed.
		if(browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "/opt/chromedriver/chromedriver");
			driver = new ChromeDriver();
		}
		return this;
	}

	public void openUrl(String url) {
		driver.get(url);
	}

	public void closeWindow() {
		driver.close();
	}
	
}
