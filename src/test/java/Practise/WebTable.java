package Practise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		//JavascriptExecutor js =(JavascriptExecutor)driver;
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> total_cols  =driver.findElements((By.xpath("//table//thead//tr//th")));
		System.out.println(total_cols.size());
		
		List<WebElement> total_rows  =driver.findElements((By.xpath("//table/tbody/tr/td[1]")));
		System.out.println(total_rows.size());
		

	}

}
