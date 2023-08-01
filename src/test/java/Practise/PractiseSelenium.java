package Practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PractiseSelenium {

	public static void main(String[] args) {
		
	// TODO Auto-generated method stub
	WebDriver driver = new ChromeDriver();
	JavascriptExecutor js = (JavascriptExecutor)driver;
	driver.get("https://arena-magna.customerdevsites.com/");
	//driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.findElement(By.name("text-637")).sendKeys("parkash");;
	driver.findElement(By.name("email-139")).sendKeys("parkash@mailinator.com");
	driver.findElement(By.name("intl_tel-758-cf7it-national")).sendKeys("90333");
	driver.findElement(By.name("text-757")).sendKeys("abcdef");
	js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//input[@class='wpcf7-form-control has-spinner wpcf7-submit btn']"))); 
	//driver.close();

	}

}
