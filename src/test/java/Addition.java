import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import practice_maven.Calculator_Base;

public class Addition extends Calculator_Base{
	int m1=-234234;
	String n1=Integer.toString(m1);
	int m2=345345;
	String n2=Integer.toString(m2);
	
    @BeforeMethod
  public void browserOpen() throws IOException, InterruptedException {
	openbrowser();
}

@Test
public void arithmaticAddition() throws InterruptedException {
	
	driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[1]/span[4]")).clear();
	driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[1]/span[4]")).sendKeys(n1);
	driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[1]/span[4]")).sendKeys("+");
	driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[1]/span[4]")).sendKeys(n2);
	driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[1]/span[4]")).sendKeys("=");

	Thread.sleep(5000);
	String data=driver.findElement(By.id("sciInPut")).getText();
	Assert.assertEquals(data,111111);
}
	
@AfterClass
public void close() throws InterruptedException {
	closeBrowesr();
}
}
