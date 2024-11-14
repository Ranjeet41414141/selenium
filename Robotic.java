package first_SeleniumProject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robotic {
public static void main(String[] args) throws Exception {
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://ctcorphyd.com/SureshIT/login.php");
	Thread.sleep(3000);
	driver.findElement(By.name("txtUserName")).sendKeys("sureshit");
	driver.findElement(By.name("txtPassword")).sendKeys("sureshit");
	Thread.sleep(3000);
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_TAB);
	r.keyRelease(KeyEvent.VK_TAB);
	
	Thread.sleep(3000);
	r.keyPress(KeyEvent.VK_TAB);
	r.keyRelease(KeyEvent.VK_TAB);
	
	r.keyPress(KeyEvent.VK_TAB);
	r.keyRelease(KeyEvent.VK_TAB);
	
	System.err.println("TAB");
	
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(3000);
	System.out.println("Inter");
	System.out.println("Login complite");
	
	driver.close();
			
			
}
}
