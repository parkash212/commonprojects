package Iflooring;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class StaffDashboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		driver.get("https://iflooring.customerdevsites.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("email")).sendKeys("admin@admin.com1");
		driver.findElement(By.name("password")).sendKeys("111111");
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Test Status']")).click();
		driver.findElement(By.xpath("//tbody/tr[1]/td[14]/a[1]")).click();
		WebElement button = driver.findElement(By.xpath("//input[@value='Next']"));
		
		js.executeScript("arguments[0].click();",button);
		
		
		driver.findElement(By.xpath("//input[@value='Save']")).click();
		Select testing = new Select(driver.findElement(By.name("tester[]")));
		testing.selectByVisibleText("Graceold");
		WebElement button2 = driver.findElement(By.xpath("//input[@value='Submit']"));//.click();
		js.executeScript("arguments[0].click();",button2);
		driver.quit();	
	}
}
