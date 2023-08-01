package Practise;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_interview {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

// explicitly wait
// WebDriverWait wait = new WaitDriverWait(driver);
//wait.until(visibilityof.ExpectedElement(driver.findElement(By.xpath(""))

	}

}
