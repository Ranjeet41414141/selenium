package first_SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class File_Upalod {
public static void main(String[] args) throws Exception {		
WebDriver driver = new ChromeDriver();
driver.navigate().to("https://ctcorphyd.com/SureshIT/login.php");
driver.findElement(By.name("txtUserName")).sendKeys("sureshit");
driver.findElement(By.name("txtPassword")).sendKeys("sureshit");
driver.findElement(By.name("Submit")).click();

Thread.sleep(3000);
Actions ac=new Actions(driver);
Thread.sleep(3000);
ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
Thread.sleep(3000);
System.out.println("Perform move to element");
driver.findElement(By.linkText("Add Employee")).click();
Thread.sleep(3000);
driver.switchTo().frame("rightMenu");
driver.findElement(By.xpath("//input[@id='txtEmpLastName']")).sendKeys("Kumar");
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@id='txtEmpFirstName']")).sendKeys("Ranjeet");
Thread.sleep(4000);
WebElement fileInput=driver.findElement(By.id("photofile"));
Thread.sleep(4000);
fileInput.sendKeys("C:\\Users\\Ranjeetkumar\\Pictures\\Screenshots.jpg");
Thread.sleep(4000);
System.out.println("File Uplode");
driver.findElement(By.xpath("//input[@class='savebutton']")).click();
System.out.println("File save");
driver.findElement(By.linkText("Logout")).click();
Thread.sleep(3000);
System.out.println("Logout complite");
driver.close();


}
}