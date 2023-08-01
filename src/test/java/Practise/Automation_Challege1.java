package Practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automation_Challege1 {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://blazedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Select test = new Select(driver.findElement(By.xpath("//select[@name='fromPort']")));
		test.selectByVisibleText("Portland");
		Select test2 = new Select(driver.findElement(By.xpath("//select[@name='toPort']")));
		test2.selectByVisibleText("London");
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
		
		int rows =driver.findElements(By.xpath("//table[@class='table']//tbody//tr")).size();
		System.out.println("no of flight:" + rows);
		
		driver.findElement(By.xpath("//table[@class='table']//tbody//tr[2]//td[1]")).click();

	}

}
