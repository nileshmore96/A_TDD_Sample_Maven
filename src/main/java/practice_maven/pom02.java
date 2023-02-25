package practice_maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom02 {
	@FindBy(xpath="//tr[@align='center']")private WebElement id;

	public pom02(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public String Managerid() {
		String ID=id.getText();
		return ID;
	}
}
