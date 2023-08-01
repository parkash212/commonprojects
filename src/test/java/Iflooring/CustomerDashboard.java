package Iflooring;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CustomerDashboard {
	@Test

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("incognito");
		//options.addArguments("headless");
     	TakesScreenshot scrShot =((TakesScreenshot)driver);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.get("https://iflooring.customerdevsites.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.findElement(By.name("email")).sendKeys("naveen@gmail.com");
		driver.findElement(By.name("password")).sendKeys("111111");
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		// Actions action = new Actions(driver);
		// action.moveToelement
		WebElement button = driver.findElement(By.xpath("//a[normalize-space()='Bookings']"));
		 Actions action = new Actions(driver);
		action.moveToElement(button).click().perform();
		
		driver.findElement(By.name("applicant")).sendKeys("kevin3");
		driver.findElement(By.name("app_no")).sendKeys("kevin3");
		driver.findElement(By.name("applicant_address")).sendKeys("dubai");
		driver.findElement(By.name("applicant_contact_person")).sendKeys("kevin3");
		driver.findElement(By.name("applicant_contact_person_email")).sendKeys("kevin3@mailinator.com");
		driver.findElement(By.name("factory")).sendKeys(" vinegar3");
		driver.findElement(By.name("product_name")).sendKeys("salena9");
		//driver.findElement(By.name("standard_no[]")).sendKeys("36");
		
		Select test = new Select(driver.findElement(By.name("test[]")));
		List<WebElement> elm = driver.findElements(By.name("test[]"));
	//	List<WebElement> sp = test.getOptions();
		//System.out.println("total no of options : "+ sp.size());
	
	/*	for(int i =0;i<elm.size();i++) {
			//String opts = sp.get(i).getText();
			System.out.println(elm.get(i).getText());
		}
		for(int i = 0;i<elm.size();i++) {
			if(elm.get(i).getText().equals("DENSITY(Y-SYS-002C)")) { // DENSITY(Y-SYS-002C)
				elm.get(i).click();
				break;
			}
		}*/
		// System.out.println("total options " + test.getOptions());
		// List<WebElement> ps = for(int i =0;i<test.getOptions();i++)
		//test.selectByVisibleText("DENSITY(Y-SYS-001C)");
		//test.selectByVisibleText("DENSITY(Y-SYS-002C)");
		//test.selectByVisibleText("DENSITY(Y-SYS-003C)");
	//	test.selectByVisibleText("DENSITY(Y-SYS-004C)");
		//test.selectByVisibleText("MOISTURE CONTENT(Y-SYS-005C)");
		//test.selectByVisibleText("MOISTURE CONTENT(Y-SYS-006C)");
		//test.selectByVisibleText("SURFACE BOND(Y-SYS-013C)");
		//test.selectByVisibleText("MODULUS OF RUPTURE & ELASTICITY(Y-SYS-008C)");
		//test.selectByVisibleText("HORIZONTAL SHEAR STRENGTH(Y-SYS-009C)");
		test.selectByVisibleText("MODULUS OF RUPTURE & ELASTICITY(Y-SYS-010C)");
		//test.selectByVisibleText("VARNISH BYK GLOSS RETENTION(Y-SYS-011C)");
		//test.selectByVisibleText("INTERNAL BONDING STRENGTH(Y-SYS-012C)");
		//test.selectByVisibleText("SURFACE BOND(Y-SYS-013C)");
		//test.selectByVisibleText("SURFACE BOND(Y-SYS-014C)");
		//test.selectByVisibleText("SURFACE SCRATCH RESISTANCE(Y-SYS-016C)");
		//test.selectByVisibleText("SURFACE SCRATCH RESISTANCE(Y-SYS-017C)");
		//test.selectByVisibleText("SURFACE SCRATCH RESISTANCE(Y-SYS-018C)");
		//test.selectByVisibleText("SURFACE CIGARETTE BURNING RESISTANCE(Y-SYS-019C)");
		//test.selectByVisibleText("FORMALDEHYDE EMISSION(Y-SYS-020C)");
		//test.selectByVisibleText("FORMALDEHYDE EMISSION(Y-SYS-021C)");
		//test.selectByVisibleText("FORMALDEHYDE EMISSION(Y-SYS-022C)");
		//test.selectByVisibleText("FORMALDEHYDE EMISSION(Y-SYS-023C)");
		//test.selectByVisibleText("FORMALDEHYDE EMISSION(Y-SYS-024C)");
		//test.selectByVisibleText("VARNISH STAINING RESISTANCE");
		//test.selectByVisibleText("VARNISH ADHERENCE(Y-SYS-026C)");
		//test.selectByVisibleText("VARNISH ADHERENCE(Y-SYS-027C)");
		//test.selectByVisibleText("VARNISH ADHERENCE(Y-SYS-028C)");
		//test.selectByVisibleText("VARNISH HARDNESS(Y-SYS-029C)");
		//test.selectByVisibleText("DEEP SCRATCH RESISTANCE(Y-SYS-030C)");
		//test.selectByVisibleText("PEEL RESISTANCE(Y-SYS-031C)");
		//test.selectByVisibleText("WATER ABSORPTION(Y-SYS-032C)");
		//test.selectByVisibleText("SURFACE RESISTANCE TO ABRASION (Y-SYS-034C)");
		//test.selectByVisibleText("SURFACE RESISTANCE TO ABRASION (Y-SYS-035C)");
		//test.selectByVisibleText("SURFACE RESISTANCE TO ABRASION (Y-SYS-036C)");
		//test.selectByVisibleText("SURFACE RESISTANCE TO ABRASION (Y-SYS-038C)");
		//test.selectByVisibleText("SURFACE RESISTANCE TO ABRASION (Y-SYS-039C)");
		//test.selectByVisibleText("SURFACE RESISTANCE TO ABRASION (Y-SYS-042C)");
		//test.selectByVisibleText("SURFACE RESISTANCE TO ABRASION (Y-SYS-043C)");
		//test.selectByVisibleText("SURFACE RESISTANCE TO ABRASION (Y-SYS-044C)");
		//test.selectByVisibleText("VARNISH IMPACT RESISTANCE LARGE BALL(Y-SYS-045C)");
		
		//test.selectByVisibleText("VARNISH IMPACT RESISTANCE LARGE BALL(Y-SYS-046C)");
		//test.selectByVisibleText("VARNISH IMPACT RESISTANCE LARGE BALL(Y-SYS-047C)");
		//test.selectByVisibleText("VARNISH IMPACT RESISTANCE LARGE BALL(Y-SYS-048C)");
		//test.selectByVisibleText("VARNISH IMPACT RESISTANCE SMALL BALL(Y-SYS-049C)");
		//test.selectByVisibleText("VARNISH STAINING RESISTANCE(Y-SYS-050C)");
		//test.selectByVisibleText("VARNISH STAINING RESISTANCE(Y-SYS-051C)");
		//test.selectByVisibleText("RESISTANCE TO CHEMICALS(Y-SYS-052C)");
		//test.selectByVisibleText("NATURE OIL STAINING RESISTANCE(Y-SYS-053C)");
		//test.selectByVisibleText("SURFACE STAINING RESISTANCE(Y-SYS-055C)");
		//test.selectByVisibleText("RESISTANCE TO STAINING (Y-SYS-056C)");
		//test.selectByVisibleText("VARNISH STAINING RESISTANCE(Y-SYS-057C)");
		//test.selectByVisibleText("STAINING RESISTANCE(Y-SYS-058C)");
		//test.selectByVisibleText("SURFACE STAINING RESISTANCE(Y-SYS-059C)");
		//test.selectByVisibleText("RESISTANCE TO CHEMICALS(Y-SYS-060C)");
		//test.selectByVisibleText("RESISTANCE TO CHEMICALS(Y-SYS-061C)");
		//test.selectByVisibleText("VARNISH STAINING RESISTANCE(Y-SYS-062C)");
		//test.selectByVisibleText("MICRO SCRATCH RESISTANCE(Y-SYS-063C)");
		//test.selectByVisibleText("MICRO SCRATCH RESISTANCE(Y-SYS-064C)");
		//test.selectByVisibleText("DELAMINATION I(Y-SYS-065C)");
		//test.selectByVisibleText("DELAMINATION II(Y-SYS-066C)");
		//test.selectByVisibleText("WIDTH SWELLING(Y-SYS-072C)");
	
		//try {
	/*	List<WebElement> checkboxes = driver.findElements(By.xpath("//label//span"));
		System.out.println(checkboxes.size());
		 for(int c =6;c<checkboxes.size();c++) {
			js.executeScript("arguments[0].click();",checkboxes.get(c)); // args).get(c).click();
			checkboxes.get(c).click(); 
		}*/
		//} // for try block
	//	catch ( Exception e) {
			//System.out.println(e);
		//} // for catch block
		
		//	Thread.sleep(3000);
		driver.findElement(By.name("client_name")).sendKeys("random");
		driver.findElement(By.name("client_application_date")).sendKeys("15032023"); 
		WebElement buttons = driver.findElement(By.xpath("//input[@value='Create']"));
		js.executeScript("arguments[0].click();",buttons);
	

	Thread.sleep(4000);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://iflooring.customerdevsites.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("email")).sendKeys("admin@admin.com1");
		driver.findElement(By.name("password")).sendKeys("111111");
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Test Status']")).click();
		driver.findElement(By.xpath("//tbody/tr[1]/td[14]/a[1]")).click();
		WebElement button1 = driver.findElement(By.xpath("//input[@value='Next']"));
		
		js.executeScript("arguments[0].click();",button1);
		
		driver.findElement(By.xpath("//input[@value='Save']")).click();
		Select testing = new Select(driver.findElement(By.name("tester[]")));
		List<WebElement> kaps = testing.getOptions();
		int k =kaps.size();
		for(int i =0;i<k;i++) {
		String oo =	kaps.get(i).getText();
		System.out.println(oo);
		}
		testing.selectByVisibleText("Graceold");
		WebElement button2 = driver.findElement(By.xpath("//input[@value='Submit']"));//.click();
		js.executeScript("arguments[0].click();",button2);
		// driver.quit();	
		String win1 = driver.getWindowHandle();
		System.out.println(win1);
		
		//driver.switchTo()
		//driver.navigate().back();
		//driver.quit();
		// TODO Auto-generated method stub

	}}





