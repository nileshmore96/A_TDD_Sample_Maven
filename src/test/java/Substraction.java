import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import practice_maven.Calculator_Base;

public class Substraction extends Calculator_Base{
	int m1=234823;
	String n1=Integer.toString(m1);
	int m2=-23094823;
	String n2=Integer.toString(m2);
    @BeforeClass
  public void browserOpen() throws IOException, InterruptedException {
	openbrowser();
}

@Test
public void arithmaticAddition() throws InterruptedException {
	driver.findElement(By.id("sciInPut")).sendKeys(n1);
	driver.findElement(By.linkText("-")).click();
	driver.findElement(By.id("sciInPut")).sendKeys(n2);
	driver.findElement(By.linkText("=")).click();
	Thread.sleep(5000);
	String data=driver.findElement(By.id("sciInPut")).getText();
	Assert.assertEquals(data,23329646);
}
	
@AfterClass
public void close() throws InterruptedException {
	closeBrowesr();
}
}

