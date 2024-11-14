package first_SeleniumProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_Statement {


public static void main(String[] args) throws Exception {
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://ctcorphyd.com/SureshIT/login.php");
	driver.findElement(By.name("txtUserName")).sendKeys("sureshit");
	driver.findElement(By.name("txtPassword")).sendKeys("sureshit");
	
	//wait for login btn has to be avaliable : explicitwait//fluyent wait
	
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
	wait.until(ExpectedConditions.
			   elementToBeClickable(driver.findElement(By.name("Submit"))));
	
	driver.findElement(By.name("Submit")).click();
	
	//wait for employee info: page has to avaliable : implicitwait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	
	System.out.println("Login complited");
	driver.findElement(By.linkText("Logout")).click();
	
	Thread.sleep(5000);
	driver.close();
	
	
	
}
}
