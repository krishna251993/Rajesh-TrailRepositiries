package testSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {
	@Test
	public  void login() {
		
		System.setProperty("webdriver.chrome.driver", "H:\\Ecare Student\\ActitimeTrial\\Drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
	}
	
	

}
