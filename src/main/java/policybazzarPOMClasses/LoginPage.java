package policybazzarPOMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id="mobileNo") private WebElement mobileFieldloginpage;
	@FindBy(xpath="//span[text()=\"LOGIN WITH PASSWORD\"]") private WebElement loginwithpasswordbtnloginpage;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void entermobilenumber() {
		mobileFieldloginpage.sendKeys("9527675453");
	}
	public void clickOnLoginWithPassword() {
		loginwithpasswordbtnloginpage.click();
	}
}
