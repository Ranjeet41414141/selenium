package first_SeleniumProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC001_Login {
public static void main(String[] args) throws Exception {
	System.out.println("Program start");
	
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.navigate().to("https://ctcorphyd.com/SureshIT/login.php");
	//Thread.sleep(3000);
	System.out.println("Application open");
	driver.findElement(By.name("txtUserName")).sendKeys("sureshit");
	//Thread.sleep(3000);
	driver.findElement(By.name("txtPassword")).sendKeys("sureshit");
     System.out.println("Password Interd");
     driver.findElement(By.name("Submit")).click();
     System.out.println("Enter click button");
    //  .sleep(3000);
     //driver.findElement(By.name("clear")).click();
     
	driver.findElement(By.linkText("Logout")).click();
	System.out.println("Logout application");
	//Thread.sleep(3000);
	System.out.println("Application logout");
	driver.quit();
	System.out.println("Application close");
}
}
