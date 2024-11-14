package first_SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
public static void main(String[] args) throws Exception {
	WebDriver driver = new ChromeDriver();
	Thread.sleep(4000);
	driver.navigate().to("https://ctcorphyd.com/SureshIT/login.php");
	Thread.sleep(4000);
	driver.findElement(By.name("txtUserName")).sendKeys("sureshit");
	Thread.sleep(4000);
	driver.findElement(By.name("txtPassword")).sendKeys("sureshit");
	Thread.sleep(4000);
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(4000);
	driver.switchTo().frame("rightMenu");
	Select st = new Select(driver.findElement(By.xpath("//select[@name='loc_code']")));
	Thread.sleep(4000);
	st.selectByIndex(1);
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@id='loc_name']")).sendKeys("0047");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@value='Search']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@value='Delete']")).click();
	Thread.sleep(4000);
	System.out.println("this id is deleted");
	driver.switchTo().defaultContent();
	
	
}
}
