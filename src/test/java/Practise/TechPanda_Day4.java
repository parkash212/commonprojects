package Practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TechPanda_Day4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("http://live.techpanda.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[normalize-space()='Mobile']")).click();
		driver.findElement(By.xpath("//li[1]//div[1]//div[3]//ul[1]//li[2]//a[1]")).click();
		driver.findElement(By.xpath("//li[2]//div[1]//div[3]//ul[1]//li[2]//a[1]")).click();
		
		driver.findElement(By.xpath("//button[@title='Compare']//span//span[contains(text(),'Compare')]")).click();
		for(String handles : driver.getWindowHandles()) {
			driver.switchTo().window(handles);
			
		}

	}

}
