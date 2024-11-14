package first_SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC003 {
public static void main(String[] args) throws Exception {
	WebDriver driver=new ChromeDriver();
	Thread.sleep(3000);
	driver.navigate().to("https://ctcorphyd.com/SureshIT/login.php");
	Thread.sleep(3000);
	
	if(driver.getTitle().equals("OrangeHRM - New Level of HR Management")) 
	{
		System.out.println("Title is match");
	}
	else 
	{
		System.out.println("Title is not match");
		
	}
	driver.findElement(By.name("txtUserName")).sendKeys("sureshit");
	driver.findElement(By.name("txtPassword")).sendKeys("sureshit");
	driver.findElement(By.name("Submit")).click();
	
	if(driver.getTitle().equals("SureshIT"))
	{
		System.out.println("Title is matched");
	}
	else 
	{
		System.out.println("Title is not matched");
	}
	Actions ac=new Actions(driver);
	Thread.sleep(3000);
	ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
    System.out.println("Mouse over complite");
    Thread.sleep(4000);
    driver.findElement(By.linkText("Add Employee")).click();
    Thread.sleep(4000);
    
    driver.switchTo().frame("rightMenu");
    
    driver.findElement(By.xpath("//input[@id='txtEmpLastName']")).sendKeys("Mahto");
    
    driver.findElement(By.xpath("//input[@id='txtEmpFirstName']")).sendKeys("Ranjeet");
    driver.findElement(By.xpath("//*[@id=\"txtEmpMiddleName\"]")).sendKeys("kumar");
    driver.findElement(By.xpath("//*[@id=\"txtEmpNickName\"]")).sendKeys("Tiger");
    driver.findElement(By.xpath("//*[@id=\"btnEdit\"]")).click();
    System.out.println("Add employee sucss");
	
	//driver.findElement(By.linkText("Logout")).click();
	
	//System.out.println("Login complite");
	//driver.quit();
}
}
