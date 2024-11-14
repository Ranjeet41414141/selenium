package first_SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC001_1 {
public static void main(String[] args) throws Exception {
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://ctcorphyd.com/SureshIT/login.php");
	Thread.sleep(4000);
	if(driver.getTitle().equals("OrangeHRM - New Level of HR Management")) {
	
	System.out.println("Title matched");
	}
	else {
		System.out.println("Title not matched");
		System.out.println(driver.getTitle());
	}
	driver.findElement(By.name("txtUserName")).sendKeys("sureshit");
	driver.findElement(By.name("txtPassword")).sendKeys("sureshit");
	Thread.sleep(3000);
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(3000);
	System.out.println("Login complit");
	
	//System.out.println(title);
	if(driver.getTitle().equals("SureshIT")) {
		System.out.println("Titel match");
	}
	else {
		System.out.println("Titel is not matched");
		System.out.println(driver.getTitle());
	}
	Thread.sleep(4000);
	//driver.findElement(By.linkText("Logout")).click();
	driver.findElement(By.xpath("//a[text()='Logout']")).click();
	System.out.println("Logout is complite");
	Thread.sleep(4000);
	driver.quit();
	System.out.println("Application is close");
}
}
