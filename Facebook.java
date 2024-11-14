package first_SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
public static void main(String[] args) throws Exception {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	Thread.sleep(4000);
    driver.navigate().to("https://www.facebook.com/");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("rk41414141@gmail.com");
	Thread.sleep(4000);
	driver.findElement(By.name("pass")).sendKeys("Ranjeet_@41");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//button[starts-with(@id,u_0)]")).click();
	Thread.sleep(4000);
	System.out.println("login complite");
	driver.close();
}
}
