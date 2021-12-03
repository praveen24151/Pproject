package sender;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import java.util.Properties;

public class yahoomail {
	
	public  void sender() throws InterruptedException, AWTException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Properties prop=new Properties();
		FileInputStream f1=new  FileInputStream("C:\\Users\\HP\\Selenium\\yahoomail\\src\\main\\java\\dataproparties");
		prop.load(f1);
		
		driver.get("https://login.yahoo.com/");
		
		
		driver.findElement(By.id("login-username")).sendKeys(prop.getProperty("id1"));
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("login-passwd")).sendKeys(prop.getProperty("pass1"));
		//driver.findElement(By.className("password")).sendKeys("Pnk@1234");
		driver.findElement(By.id("login-signin")).click();
		
		driver.findElement(By.xpath("//*[@class='icon mail']")).click();
		
		//Assert.assertTrue(driver.findElement(By.xpath("//*[@data-test-id='attachment-icon']")).isDisplayed());
		
		driver.findElement(By.cssSelector("a[role='button']")).click();
		driver.findElement(By.id("message-to-field")).sendKeys(prop.getProperty("id2"));
		driver.findElement(By.xpath("//button[@data-test-id='icon-btn-attach']")).click();
		driver.findElement(By.xpath("//*[text()='Attach files from computer']")).click();
		Robot rb = new Robot();
		Thread.sleep(3000);
		StringSelection str = new StringSelection("G:\\praveen.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);

		// press Contol+V for pasting
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		// release Contol+V for pasting
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		// for pressing and releasing Enter
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[text()='Send']")).click();
		driver.findElement(By.xpath("//*[@data-test-id='primary-btn']")).click();
		driver.findElement(By.xpath("//div[@class='_yb_1tv83']")).click();
		driver.findElement(By.xpath("//a[@id='profile-signout-link']")).click();
				

}
	
}
