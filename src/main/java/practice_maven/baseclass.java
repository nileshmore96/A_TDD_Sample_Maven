package practice_maven;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class baseclass {
	public static WebDriver driver;
	public static void openbrowser() throws IOException, InterruptedException {
	 driver=WebDriverManager.chromedriver().create();
	 driver.get(utilityClass.file("URL"));
	 driver.manage().window().maximize();
	 Thread.sleep(5000);
	}
	
	public static void closeBrowesr() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
	}
}
