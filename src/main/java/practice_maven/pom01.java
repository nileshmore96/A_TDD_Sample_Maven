package practice_maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom01 {
	@FindBy (xpath="//input[@name='uid']")private WebElement user;
	@FindBy (xpath="//input[@name='password']")private WebElement pass;
	@FindBy (xpath="//input[@name='btnLogin']")private WebElement click;

	public pom01(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void username(String abc) {
		user.sendKeys(abc);
	}
	public void password(String xyz) {
		pass.sendKeys(xyz);
	}
	public void loginbutton() {
		click.click();
	}
}
