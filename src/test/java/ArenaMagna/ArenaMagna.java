package ArenaMagna;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArenaMagna {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.get("https://arena-magna.customerdevsites.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds((10)));
		//List<WebElement> ele = driver.findElements(By.tagName("a"));
		try {
		List<WebElement> ele = driver.findElements(By.tagName("img"));
		
		System.out.println(ele.size());
		
		driver.findElement(By.xpath("//input[@placeholder='Full Name']")).sendKeys("parkash");
	
		WebElement button = driver.findElement(By.xpath("//input[@value='Submit']")); 
		}catch (Exception e) {
		js.executeScript("arguments[0],click();",button);}
		//} catch (Exception e) {
		TakesScreenshot screenshot = ((TakesScreenshot)driver);
		File srcFile = screenshot.getScreenshotAs(OutputType.FILE); 
		File destfile = new File("C:\\Users\\iMark Admin\\Desktop\\Code editor\\seleniumproject\\Screenshot");
		FileUtils.copyFile(srcFile, destfile);
		
		/*for(WebElement link:ele){
			 System.out.println( link.getAttribute("href")); // + " - " + link.getAttribute("href")
		// link.getText() + " - " +
			 }*/
		for(WebElement imageFromList:ele){
		     String ImageUrl=imageFromList.getAttribute("src");
		     System.out.println(ImageUrl); //will get you all the image urls on the page
		}
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://arena-magna.customerdevsites.com/seo/");
        List<WebElement> ele2 = driver.findElements(By.tagName("img"));
		System.out.println("SEO IMAGES NUMBER = " + ele2.size());
		System.out.println("-------SEO----------------SEO PAGE-----------------------SEO------------- ");
		for(WebElement seo:ele2) {
			String seopage = seo.getAttribute("src");
			
			System.out.println(seopage);
		}
	}
}
