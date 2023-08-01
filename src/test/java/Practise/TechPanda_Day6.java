package Practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TechPanda_Day6 {

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

 driver.findElement(By.xpath("//span[@class='label'][normalize-space()='Account']")).click();
 driver.findElement(By.xpath("//a[@title='My Wishlist (1 item)']")).click();
 
 driver.findElement(By.xpath("//span[text()='Add to Cart']")).click();
 
 driver.findElement(By.xpath("//li[@class='method-checkout-cart-methods-onepage-bottom']//span[contains(text(),'Proceed to Checkout')]")).click();
 driver.findElement(By.id("billing:street1")).sendKeys("toronto");
 driver.findElement(By.name("billing[city]")).sendKeys("kashmir");
 WebElement button1 = driver.findElement(By.name("billing[region_id]"));
 Select nyc = new Select(button1);
 nyc.selectByVisibleText("Alabama");
 driver.findElement(By.name("billing[postcode]")).sendKeys("135");
// WebElement button2 = 
 driver.findElement(By.xpath("//select[@id='billing:region_id']"));
// Select nyc2 = new Select(button2);
// nyc2.selectByVisibleText("Argentina");
 driver.findElement(By.id("billing:telephone")).sendKeys("901");
 driver.findElement(By.xpath("//button[@title='Continue' and @class='button' and @onclick='billing.save()']")).click();
 Thread.sleep(5000);
 
 driver.findElement(By.xpath(" //button[@onclick='shippingMethod.save()']//span//span[contains(text(),'Continue')]")).click()
; //checkbox 
 Thread.sleep(2000);
 driver.findElement(By.xpath("//label[@for='p_method_checkmo']")).click();
 
 driver.findElement(By.xpath("//button[@onclick='payment.save()']//span//span[contains(text(),'Continue')]")).click();

 WebElement target = driver.findElement(By.xpath("//button[@class='button validation-passed']//span[text()='Continue']"));
 js.executeScript("arguments[0].click();" ,target);
 Thread.sleep(2000);
 //place order
 driver.findElement(By.xpath("//span[contains(text(),'Place Order')]")).click();
 
 String order_id = driver.findElement(By.xpath("//div[@class='main-container col1-layout']//p[1]")).getText();
 System.out.println(order_id);
 
		
				
				

	}

}
