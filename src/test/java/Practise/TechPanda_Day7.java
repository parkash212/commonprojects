package Practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TechPanda_Day7 {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js =(JavascriptExecutor)driver;
		driver.get("http://live.techpanda.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[@class='label'][normalize-space()='Account']")).click();
		driver.findElement(By.xpath("//a[@title='Log In']")).click();
		driver.findElement(By.name("login[username]")).sendKeys("nyc@mailinator.com");
		driver.findElement(By.name("login[password]")).sendKeys("1234567890");	
		driver.findElement(By.name("send")).click();	
		Thread.sleep(3000);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("http://live.techpanda.org/");
		driver.findElement(By.xpath("//div[@class='footer']//a[@title='My Account']")).click();
		
		driver.findElement(By.xpath("//a[text()='My Orders']")).click();
		driver.findElement(By.xpath("//tr[1]//a[text()='View Order']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Print Order']")).click();
		

	}

}
