package sender;

import java.awt.AWTException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class yahooreciver {
	
	public void mailreciv() throws InterruptedException, AWTException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Properties prop=new Properties();
		FileInputStream f1=new  FileInputStream("C:\\Users\\HP\\Selenium\\yahoomail\\src\\main\\java\\dataproparties");
		prop.load(f1);
		
		driver.get("https://login.yahoo.com/");
		
		
		driver.findElement(By.id("login-username")).sendKeys(prop.getProperty("id2"));
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("login-passwd")).sendKeys(prop.getProperty("pass2"));
		//driver.findElement(By.className("password")).sendKeys("Pnk@1234");
		driver.findElement(By.id("login-signin")).click();
		
		driver.findElement(By.xpath("//*[@class='icon mail']")).click();
		//driver.findElement(By.xpath("//div[@data-test-id='loading-bar']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@data-test-id='attachment-icon']")).click();
		
	}
}
