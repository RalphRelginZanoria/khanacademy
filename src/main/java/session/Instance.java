package session;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instance {

	public static WebDriver driver;

	public static void createChromeSessionAndNavigateTo(String url){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tr_lnd_user\\Desktop\\khan-academy\\src\\main\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
	}

	public static void createFirefoxSessionNavigateTo(String url){

	}

	public static void quitDriverSession() {
		driver.quit();
	}
}
