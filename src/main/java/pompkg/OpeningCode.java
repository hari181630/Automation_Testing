package pompkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class OpeningCode {
	
	@Test	
	public void m1() {
WebDriver driver= new FirefoxDriver();
driver.manage().window().maximize();
driver.get("https://www.youtube.com/");


	}
}
