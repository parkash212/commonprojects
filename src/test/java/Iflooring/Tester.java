package Iflooring;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tester {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		JavascriptExecutor js =  (JavascriptExecutor)driver;
		driver.get("https://iflooring.customerdevsites.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("email")).sendKeys("testgrace@ifl.com");
		driver.findElement(By.name("password")).sendKeys("111111");
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Test Status']")).click();
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("KEVIN44");
		
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
	   
		  WebElement ele =  wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//td[3]//a"))));
		   ele.click();
		   driver.findElement(By.xpath("//button[@alt='Y-SYS-087B3']")).click();
		
		/*WebElement buttons = driver.findElement(By.xpath("//tr//td[3]"));
		//Thread.sleep(3000);
		js.executeScript("arguments[0].click();", buttons);
		//buttons.click();
		*/

	}

}
