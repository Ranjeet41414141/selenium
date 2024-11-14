package first_SeleniumProject;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tes
{
	public static void main(String[] args) throws Exception
	{
	WebDriver driver=new ChromeDriver();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	Thread.sleep(4000);
	driver.navigate().to("https://ctcorphyd.com/SureshIT/login.php");
	Thread.sleep(4000);
     driver.findElement(By.name("txtUserName")).sendKeys("sureshit");
     Thread.sleep(4000);
	driver.findElement(By.name("txtPassword")).sendKeys("sureshit");
	Thread.sleep(4000);
	driver.findElement(By.name("clear")).click();
	System.out.println("Clear ho gaya");
	Thread.sleep(4000);
	String un=driver.findElement(By.name("txtUserName")).getText();
	String pw=driver.findElement(By.name("txtPassword")).getText();
	
	//String st=uname.getText();
	//String sp=pw.getText();
	Thread.sleep(4000);
	if(un.equals("") && pw.equals("")) {
		System.out.println("Clear button is working fine");
	}
	else {
		System.out.println("Clear button is not working");
	}
	
    driver.get("https://www.google.com/");
    Thread.sleep(4000);
    driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("Selenium"+Keys.ENTER);
    System.out.println("Send seleniyam");
//    Robot ro=new Robot();
//    ro.keyPress(KeyEvent.VK_ENTER);
//    ro.keyRelease(KeyEvent.VK_ENTER);
    
    
    
	driver.close();
	
	
	}
	}
