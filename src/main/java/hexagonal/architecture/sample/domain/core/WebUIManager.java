package hexagonal.architecture.sample.domain.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebUIManager implements SUTManager {
	private WebDriver driver;

		public SUTManager useApplication(String applicationType) {
			// TODO Factory needed.
			if(applicationType.equals("CHROME")) {
				System.setProperty("webdriver.chrome.driver", "/opt/chromedriver/chromedriver");
				driver = new ChromeDriver();
			}
			return this;
		}
	
	public void open(String url) {
		driver.get(url);
	}

}
