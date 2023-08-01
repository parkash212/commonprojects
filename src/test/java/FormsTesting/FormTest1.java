package FormsTesting;

import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FormTest1 {
	public static void main(String args[]) throws InterruptedException {
	
	//JavascriptExecutor js = (JavascriptExecutor)driver;
	
	//driver.manage().deleteAllCookies();
	
	WebDriver driver = new ChromeDriver();
	//WebDriver driver = new EdgeDriver();
	driver.get("https://www.imarkinfotech.com/");
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    JavascriptExecutor js = (JavascriptExecutor)driver;
    driver.findElement(By.xpath("//a[@class='btnEffect gitBtn magicBtn btn']")).click();
    //Thread.sleep(3000);
   // js.executeScript("arguments[0].click();",button_1 ); 
    
    //WebElement button1= driver.findElement(By.name("name"));//.sendKeys("parkash");
    //js.executeScript("arguments[0].setAttribute('value','parkash')",button1 );
    
    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
    
    WebElement toss = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("name"))));
    toss.sendKeys("parkash");
    
    //Thread.sleep(3000);
    try { 
    WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(10));
    WebElement button2 = wait2.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='form-group']//input[@name='email']"))));
   button2.sendKeys("p");
	} catch(Exception e)
	{
		System.out.println(e);}
		//  WebElement button2 = driver.findElement(By.name("email"));
    //js.executeScript("arguments[0].setAttribute('value','parkash.sharma@imarkinfotech.com')",button2 );
    //js.executeScript("document.getElementById('email').value ='parkash.sharma@imarkinfotech.com'");
    
    WebElement button3= driver.findElement(By.xpath("//div[@class='form-group']//input[@name='phone']"));
    js.executeScript("arguments[0].setAttribute('value','9034734199')",button3 );
    
    WebElement butt= driver.findElement(By.xpath("//input[@name='skype_whatsapp']"));
    js.executeScript("arguments[0].setAttribute('value','website')",butt );
   //driver.findElement(By.xpath("//input[@name='skype_whatsapp']")).sendKeys("web");
    
    WebElement button4=driver.findElement(By.xpath("//textarea[@name='about_project']"));//.sendKeys("Web development");
    js.executeScript("arguments[0].setAttribute('value','Web development')",button4 );
    //driver.findElement(By.name("lookingFor[]");
    //driver.close();
	
	
	}
}
