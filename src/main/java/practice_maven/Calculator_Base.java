package practice_maven;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Calculator_Base {
	public static WebDriver driver;
	
	public static void openbrowser() throws IOException, InterruptedException {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\parat\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.get("https://www.calculator.net");
	 driver.manage().window().maximize();
	 Thread.sleep(5000);
	}
	
	public static void closeBrowesr() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
	}
}
