package MavenProjectORGHRM.ORGHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunchTest {
	
	@Test
public void browserlaunch(){
		
		//setup the chrome driver using webdriverMangaer
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");

}
}
