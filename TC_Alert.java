package first_SeleniumProject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_Alert {
public static void main(String[] args) throws Exception {
	WebDriver driver=new ChromeDriver();
	Thread.sleep(3000);
	driver.navigate().to("https://ctcorphyd.com/SureshIT/login.php");
	Thread.sleep(3000);
	driver.findElement(By.name("txtUserName")).sendKeys("sureshit");
	Thread.sleep(3000);
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(3000);
	Alert al=driver.switchTo().alert();
	System.out.println(al.getText());
	al.accept();
	Thread.sleep(3000);
	driver.findElement(By.name("txtPassword")).sendKeys("sureshit");
	Thread.sleep(6000);
	driver.findElement(By.name("Submit")).click();
	System.out.println("Login complite");
	driver.quit();
}
}
