package genericLibraries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunch {
	
	public static WebDriver chrome() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/softwares/chromedriver.exe");
		
		return new ChromeDriver();
	}
	public static WebDriver firefox() {
		System.setProperty("webdriver.gecko.driver", "./src/test/resources/softwares/geckodriver.exe");
		
		return new FirefoxDriver();
	}
}
