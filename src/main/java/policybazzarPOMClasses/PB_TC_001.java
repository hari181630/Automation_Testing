package policybazzarPOMClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PB_TC_001 {

	public static void main(String[] args)  {
//		ChromeOptions opt = new ChromeOptions();
//		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://myaccount.policybazaar.com/");
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		LoginPage login= new LoginPage(driver);
		login.entermobilenumber();
		login.clickOnLoginWithPassword();

	}

}
