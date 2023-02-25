package practice_maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class utilityClass {
	public static String excel(int row,int column) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream(".//TestData//new.xlsx");
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet1");
		String data=sh.getRow(row).getCell(column).getStringCellValue();
		return data;
		}
	
	public static String file(String key) throws IOException {
		Properties prob=new Properties();
		FileInputStream file=new FileInputStream(".//TestData//Data.properties");
		prob.load(file);
		return prob.getProperty(key);
	}
	
	public static String screenShot(WebDriver driver,int a) throws IOException {
		File Source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
		String str=System.getProperty("user.dir")+".//Screenshot//"+a+".png";
		File des=new File(str);
		FileHandler.copy(Source, des);
		return str;
	
	}
}
