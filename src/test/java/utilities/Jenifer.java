package utilities;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.asynchttpclient.uri.Uri;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
//@Test
public class Jenifer {	
	WebDriver driver; 
	JavascriptExecutor js = (JavascriptExecutor)driver;
	Actions act = new Actions(driver);
	TakesScreenshot scrShot =((TakesScreenshot)driver);
	@BeforeClass()
void setup()  {

 driver = new ChromeDriver();
 
// for selenium grid
//ChromeOptions options = new ChromeOptions();
//driver = new RemoteWebDriver(options);
// remoteAddress: new Uri(uriString: "http://localhost:4444"), options);
//public Logger logger; // for logging
//Actions act = new Actions(driver);
//TakesScreenshot scrShot =((TakesScreenshot)driver);
//JavascriptExecutor js = (JavascriptExecutor)driver;

driver.get("http://evolvinglove.customerdevsites.com/");
	driver.manage().window().maximize(); 
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//	logger = LogManager.getLogger(this.getClass());
	}
	
	@Test
   void testlogo() throws IOException, InterruptedException {
   driver.findElement(By.xpath("//a[normalize-space()='TAKE MY FREE QUIZ NOW']")).click(); 
   driver.findElement(By.xpath(" //a[normalize-space()='START QUIZ']")).click();
   Thread.sleep(2000);
   driver.findElement(By.xpath(" //a[@class='btn btn-white mt-3']")).click(); 
   Thread.sleep(3000);
   
   // ist question
   
   driver.findElement(By.xpath(" //label[1]//span[1]")).click(); 
  WebElement button1 =  driver.findElement(By.xpath(" //a[@id='next1']")); 
  js.executeScript("arguments[0].click();",button1 );
   
  // 2nd question
//@FindBy(xpath="//span[normalize-space()='Yes']")
  // WebElement txt_yesno;
  // @FindBy(xpath=" //a[@id='next1']")
  //WebElement txt_next22;
  
   driver.findElement(By.xpath("//span[normalize-space()='Yes']")).click();   // //label[1]
   WebElement button2 = driver.findElement(By.xpath(" //a[@id='next1']")); 
   js.executeScript("arguments[0].click();",button2 );
   
// 3rd qus
 //@FindBy(xpath="//span[normalize-space()='Romantic partner']")
   // WebElement txt_romantic;
   driver.findElement(By.xpath("//span[normalize-space()='Romantic partner']")).click(); 
   WebElement button3 = driver.findElement(By.xpath(" //a[@id='next1']"));
   js.executeScript("arguments[0].click();",button3 );
   
// 4th qustion
   
   driver.findElement(By.name("question4")).sendKeys("ash");  
   WebElement button4 = driver.findElement(By.xpath(" //a[@id='next1']"));
   js.executeScript("arguments[0].click();",button4 );
   
   Thread.sleep(2000);
    driver.findElement(By.xpath("//a[@id='next1']")).click(); // //a[@id='next1']
//   js.executeScript("arguments[0].click();",ele1);
	

//5th qustion
    try {
WebElement ele1 = driver.findElement(By.xpath("//div[@class='list-container']//div[1]//label[1]//span[1]"));
WebElement ele2 = driver.findElement(By.xpath("//div[@class='rankOrder top_rank']//li[1]"));

//Actions act = new Actions(driver);
act.dragAndDrop(ele1,ele2).build().perform();
WebElement ele3 = driver.findElement(By.xpath("//span[text()='Present and accepting']")); 
WebElement ele4 = driver.findElement(By.xpath("//div[@class='rankOrder top_rank']//li[2]"));
act.dragAndDrop(ele3,ele4).build().perform();
WebElement ele5 = driver.findElement(By.xpath("//span[text()='Clear and discerning']"));
WebElement ele6 = driver.findElement(By.xpath("//div[@class='rankOrder top_rank']//li[3]"));
act.dragAndDrop(ele5,ele6).build().perform();
WebElement ele7 = driver.findElement(By.xpath("//span[text()='Inspiring and evolutionary']")); 
WebElement ele8 = driver.findElement(By.xpath("//li[@class='draggedLast-value ui-droppable']")); 
  act.dragAndDrop(ele7,ele8).build().perform();
  Thread.sleep(2000);
  WebElement button5 =driver.findElement(By.xpath("//a[@id='next1']"));
  js.executeScript("arguments[0].click();", button5); } // for try
    catch(Exception e) {
    	System.out.println(e);
    }
	
  Thread.sleep(3000); //span[contains(text(),'Being sensual and making things exciting and fun b')]
  // qustion - 6 // Being passionate and bringing excitement and enthusiasm to what we are doing
  try {
  WebElement mag1 = driver.findElement(By.xpath("//span[text()='Being sensual and making things exciting and fun between us']"));
  WebElement mag2 = driver.findElement(By.xpath("//div[@class='rankOrder top_rank']//li[1]"));
  act.dragAndDrop(mag1,mag2).build().perform();
  WebElement mag3 = driver.findElement(By.xpath("//span[text()='Being committed and staying connected so that they know they are loved']"));
  WebElement mag4 = driver.findElement(By.xpath("//div[@class='rankOrder top_rank']//li[2]"));
  act.dragAndDrop(mag3,mag4).build().perform();
  WebElement mag5 = driver.findElement(By.xpath("//span[text()='Being honest and wanting to fully understand the truth']"));
  WebElement mag6 = driver.findElement(By.xpath("//div[@class='rankOrder top_rank']//li[3]"));
  act.dragAndDrop(mag5,mag6).build().perform();
  WebElement mag7 = driver.findElement(By.xpath("//span[contains(text(),'Being open and curious to learn more about my part')]"));
  WebElement mag8 = driver.findElement(By.xpath("//li[@class='draggedLast-value ui-droppable']")); 
  act.dragAndDrop(mag7,mag8).build().perform();
  WebElement button6 =driver.findElement(By.xpath("//a[@id='next1']"));
  js.executeScript("arguments[0].click();", button6); }
  catch(Exception e) {
  	System.out.println(e);
  }
  
//  qustion = 7
  try {
  WebElement gem1 = driver.findElement(By.xpath("//span[text()='Integrity']"));
  WebElement gem2 = driver.findElement(By.xpath("//div[@class='rankOrder top_rank']//li[1]"));
  act.dragAndDrop(gem1,gem2).build().perform();
  WebElement gem3 = driver.findElement(By.xpath("//span[text()='Sovereignty']"));
  WebElement gem4 = driver.findElement(By.xpath("//div[@class='rankOrder top_rank']//li[2]"));
  act.dragAndDrop(gem3,gem4).build().perform();
  WebElement gem5 = driver.findElement(By.xpath("//span[text()='Presence']"));
  WebElement gem6 = driver.findElement(By.xpath("//div[@class='rankOrder top_rank']//li[3]"));
  act.dragAndDrop(gem5,gem6).build().perform();
  WebElement gem7 = driver.findElement(By.xpath("//span[text()='Commitment']"));
  WebElement gem8 = driver.findElement(By.xpath("//li[@class='draggedLast-value ui-droppable']")); 
  act.dragAndDrop(gem7,gem8).build().perform();
  WebElement button7 =driver.findElement(By.xpath("//a[@id='next1']"));
  js.executeScript("arguments[0].click();", button7); }
  catch(Exception e) {
  	System.out.println(e);
  }
  
  
  //qustion - 8
  try {
  WebElement gun1 = driver.findElement(By.xpath("//span[text()='Creating conversations about what can be improved']"));
  WebElement gun2 = driver.findElement(By.xpath("//div[@class='rankOrder top_rank']//li[1]"));
  act.dragAndDrop(gun1,gun2).build().perform();
  WebElement gun3 = driver.findElement(By.xpath("//span[text()='Bringing empathy and understanding']"));
  WebElement gun4 = driver.findElement(By.xpath("//div[@class='rankOrder top_rank']//li[2]"));
  act.dragAndDrop(gun3,gun4).build().perform();
  WebElement gun5 = driver.findElement(By.xpath("//span[text()='Being direct about my thoughts and feelings']"));
  WebElement gun6 = driver.findElement(By.xpath("//div[@class='rankOrder top_rank']//li[3]"));
  act.dragAndDrop(gun5,gun6).build().perform();
  WebElement gun7 = driver.findElement(By.xpath("//span[text()='Initiating provocative conversations and energizing the room']"));
  WebElement gun8 = driver.findElement(By.xpath("//li[@class='draggedLast-value ui-droppable']")); 
  act.dragAndDrop(gun7,gun8).build().perform();
  WebElement button8 =driver.findElement(By.xpath("//a[@id='next1']"));
  js.executeScript("arguments[0].click();", button8);
  } catch(Exception e) {
  	System.out.println(e);
  }
  
// qustion - 9 
  try {
  WebElement bun1 = driver.findElement(By.xpath("//span[text()='De-escalate and help to restore positive feelings between us']"));
  WebElement bun2 = driver.findElement(By.xpath("//div[@class='rankOrder top_rank']//li[1]"));
  act.dragAndDrop(bun1,bun2).build().perform();
  WebElement bun3 = driver.findElement(By.xpath("//span[text()='Speak truthfully and acknowledge what happened']"));
  WebElement bun4 = driver.findElement(By.xpath("//div[@class='rankOrder top_rank']//li[2]"));
  act.dragAndDrop(bun3,bun4).build().perform();
  WebElement bun5 = driver.findElement(By.xpath("//span[text()='Make sure we each get all our needs met']"));
  WebElement bun6 = driver.findElement(By.xpath("//div[@class='rankOrder top_rank']//li[3]"));
  act.dragAndDrop(bun5,bun6).build().perform();
  WebElement bun7 = driver.findElement(By.xpath("//span[text()='Make suggestions for what might improve things']"));
  WebElement bun8 = driver.findElement(By.xpath("//li[@class='draggedLast-value ui-droppable']")); 
  act.dragAndDrop(bun7,bun8).build().perform();
  WebElement button9 =driver.findElement(By.xpath("//a[@id='next1']"));
  js.executeScript("arguments[0].click();", button9);
  } catch(Exception e) {
	  	System.out.println(e);
	  }
  
  //qustion = 10 
  try {
  WebElement mug1 = driver.findElement(By.xpath("//span[text()='Living my values and creating an inspiring vision for our relationship']"));
  WebElement mug2 = driver.findElement(By.xpath("//div[@class='rankOrder top_rank']//li[1]"));
  act.dragAndDrop(mug1,mug2).build().perform();
  WebElement mug3 = driver.findElement(By.xpath("//span[text()='Seeing their best qualities and being grateful for what is']"));
  WebElement mug4 = driver.findElement(By.xpath("//div[@class='rankOrder top_rank']//li[2]"));
  act.dragAndDrop(mug3,mug4).build().perform();
  WebElement mug5 = driver.findElement(By.xpath("//span[text()='Honoring our sovereignty and our individual needs']"));
  WebElement mug6 = driver.findElement(By.xpath("//div[@class='rankOrder top_rank']//li[3]"));
  act.dragAndDrop(mug5,mug6).build().perform();
  WebElement mug7 = driver.findElement(By.xpath("//span[text()='Tracking what has my partner feel the most loved and adored']"));
  WebElement mug8 = driver.findElement(By.xpath("//li[@class='draggedLast-value ui-droppable']")); 
  act.dragAndDrop(mug7,mug8).build().perform();
  WebElement button10 =driver.findElement(By.xpath("//a[@id='next1']"));
  js.executeScript("arguments[0].click();", button10);
  } catch(Exception e) {
	  	System.out.println(e);
	  }
	
  
  Thread.sleep(1000);
  WebElement button11 =driver.findElement(By.xpath("//a[@id='nextpart2']")); //a[@id='nextpart2']
  js.executeScript("arguments[0].click();", button11);
  
	
  //part - 2
  //qustion - 11
  try {
  WebElement rum1 = driver.findElement(By.xpath("//span[text()='Anxious']"));
  WebElement rum2 = driver.findElement(By.xpath("//div[@class='rankOrder top_rank']//li[1]"));
  act.dragAndDrop(rum1,rum2).build().perform();
  WebElement rum3 = driver.findElement(By.xpath("//span[text()='Superior']"));
  WebElement rum4 = driver.findElement(By.xpath("//div[@class='rankOrder top_rank']//li[2]"));
  act.dragAndDrop(rum3,rum4).build().perform();
  WebElement rum5 = driver.findElement(By.xpath("//span[text()='Ashamed']"));
  WebElement rum6 = driver.findElement(By.xpath("//div[@class='rankOrder top_rank']//li[3]"));
  act.dragAndDrop(rum5,rum6).build().perform();
  WebElement rum7 = driver.findElement(By.xpath("//span[text()='Resentful']"));
  WebElement rum8 = driver.findElement(By.xpath("//li[@class='draggedLast-value ui-droppable']")); 
  act.dragAndDrop(rum7,rum8).build().perform();
  WebElement button12 =driver.findElement(By.xpath("//a[@id='next1']"));
  js.executeScript("arguments[0].click();", button12);
  } catch(Exception e) {
	  	System.out.println(e);
	  }
  
  // qustion - 12
  try {
  WebElement car1 = driver.findElement(By.xpath("//span[text()='Blame']"));
  WebElement car2 = driver.findElement(By.xpath("//div[@class='rankOrder top_rank']//li[1]"));
  act.dragAndDrop(car1,car2).build().perform();
  WebElement car3 = driver.findElement(By.xpath("//span[text()='Defend']"));
  WebElement car4 = driver.findElement(By.xpath("//div[@class='rankOrder top_rank']//li[2]"));
  act.dragAndDrop(car3,car4).build().perform();
  WebElement car5 = driver.findElement(By.xpath("//span[text()='Control']"));
  WebElement car6 = driver.findElement(By.xpath("//div[@class='rankOrder top_rank']//li[3]"));
  act.dragAndDrop(car5,car6).build().perform();
  WebElement car7 = driver.findElement(By.xpath("//span[text()='Acquiesce']"));
  WebElement car8 = driver.findElement(By.xpath("//li[@class='draggedLast-value ui-droppable']")); 
  act.dragAndDrop(car7,car8).build().perform();
  WebElement button13 =driver.findElement(By.xpath("//a[@id='next1']"));
  js.executeScript("arguments[0].click();", button13);
  } catch(Exception e) {
	  	System.out.println(e);
	  }
  
  // qustion - 13
  try {
	//label[@class='ui-draggable ui-draggable-handle']//span[text()='Use sharp piercing words']
  WebElement bar1 = driver.findElement(By.xpath("//div[@class='list-container']//div[1]//label[1]//span[1]"));
  WebElement bar2 = driver.findElement(By.xpath("//div[@class='rankOrder top_rank']//li[1]"));
  act.dragAndDrop(bar1,bar2).build().perform();
  WebElement bar3 = driver.findElement(By.xpath("//span[text()='Use sharp piercing words']"));
  WebElement bar4 = driver.findElement(By.xpath("//div[@class='rankOrder top_rank']//li[2]"));
  act.dragAndDrop(bar3,bar4).build().perform();
  WebElement bar5 = driver.findElement(By.xpath("//span[text()='Take some space from the situation']"));
  WebElement bar6 = driver.findElement(By.xpath("//div[@class='rankOrder top_rank']//li[3]"));
  act.dragAndDrop(bar5,bar6).build().perform();
  WebElement bar7 = driver.findElement(By.xpath("//span[text()='Try to fix my partner']"));
  WebElement bar8 = driver.findElement(By.xpath("//li[@class='draggedLast-value ui-droppable']")); 
  act.dragAndDrop(bar7,bar8).build().perform();
  WebElement button14 =driver.findElement(By.xpath("//a[@id='next1']"));
  js.executeScript("arguments[0].click();", button14);
  } catch(Exception e) {
	  	System.out.println(e);
	  }
  
  //qustion - 14
  try {
  WebElement on1 = driver.findElement(By.xpath("//span[text()='Connection']"));
  WebElement on2 = driver.findElement(By.xpath("//div[@class='rankOrder top_rank']//li[1]"));
  act.dragAndDrop(on1,on2).build().perform();
  WebElement on3 = driver.findElement(By.xpath("//span[text()='Kindness']"));
  WebElement on4 = driver.findElement(By.xpath("//div[@class='rankOrder top_rank']//li[2]"));
  act.dragAndDrop(on3,on4).build().perform();
  WebElement on5 = driver.findElement(By.xpath("//span[text()='Space']"));
  WebElement on6 = driver.findElement(By.xpath("//div[@class='rankOrder top_rank']//li[3]"));
  act.dragAndDrop(on5,on6).build().perform();
  WebElement on7 = driver.findElement(By.xpath("//span[text()='Acceptance']"));
  WebElement on8 = driver.findElement(By.xpath("//li[@class='draggedLast-value ui-droppable']")); 
  act.dragAndDrop(on7,on8).build().perform();
  WebElement button15 =driver.findElement(By.xpath("//a[@id='next1']"));
  js.executeScript("arguments[0].click();", button15);
  } catch(Exception e) {
	  	System.out.println(e);
	  }
  
  //qustion - 15
  try {
  WebElement off1 = driver.findElement(By.xpath("//span[text()='Resist and burrow deep down inside']"));
  WebElement off2 = driver.findElement(By.xpath("//div[@class='rankOrder top_rank']//li[1]"));
  act.dragAndDrop(off1,off2).build().perform();
  WebElement off3 = driver.findElement(By.xpath("//span[text()='React with frustration and blame']"));
  WebElement off4 = driver.findElement(By.xpath("//div[@class='rankOrder top_rank']//li[2]"));
  act.dragAndDrop(off3,off4).build().perform();
  WebElement off5 = driver.findElement(By.xpath("//span[text()='Dissociate and focus on my needs']"));
  WebElement off6 = driver.findElement(By.xpath("//div[@class='rankOrder top_rank']//li[3]"));
  act.dragAndDrop(off5,off6).build().perform();
  WebElement off7 = driver.findElement(By.xpath("//span[text()='Feel numb and make compromises to move things forward']"));
  WebElement off8 = driver.findElement(By.xpath("//li[@class='draggedLast-value ui-droppable']")); 
  act.dragAndDrop(off7,off8).build().perform();
  WebElement button16 =driver.findElement(By.xpath("//a[@id='next1']"));
  js.executeScript("arguments[0].click();", button16);
  } catch(Exception e) {
	  	System.out.println(e);
	  }
  //qustion -16
  Thread.sleep(2000);
  try {
  WebElement key1 = driver.findElement(By.xpath("//div[@class='list-container']//div[1]//label[1]//span[1]"));
  WebElement key2 = driver.findElement(By.xpath("//div[@class='rankOrder top_rank']//li[1]"));
  act.dragAndDrop(key1,key2).build().perform();
  WebElement key3 = driver.findElement(By.xpath("//div[@class='list-container']//div[2]//label[1]//span[1]"));
  WebElement key4 = driver.findElement(By.xpath("//div[@class='rankOrder top_rank']//li[2]"));
  act.dragAndDrop(key3,key4).build().perform();
  WebElement key5 = driver.findElement(By.xpath("//div[@class='list-container']//div[3]//label[1]//span[1]"));
  WebElement key6 = driver.findElement(By.xpath("//div[@class='rankOrder top_rank']//li[3]"));
  act.dragAndDrop(key5,key6).build().perform();
  WebElement key7 = driver.findElement(By.xpath("//div[@class='list-container']//div[4]//label[1]//span[1]"));
  WebElement key8 = driver.findElement(By.xpath("//li[@class='draggedLast-value ui-droppable']")); 
  act.dragAndDrop(key7,key8).build().perform();
  WebElement button17 =driver.findElement(By.xpath("//a[@id='next1']"));
  js.executeScript("arguments[0].click();", button17);
  } catch(Exception e) {
	  	System.out.println(e);
	  }
  
  //qustion - 17
  try {
  WebElement keys1 = driver.findElement(By.xpath("//span[text()='Needy or desperate']"));
  WebElement keys2 = driver.findElement(By.xpath("//div[@class='rankOrder top_rank']//li[1]"));
  act.dragAndDrop(keys1,keys2).build().perform();
  WebElement keys3 = driver.findElement(By.xpath("//span[text()='Superior or blamey']"));
  WebElement keys4 = driver.findElement(By.xpath("//div[@class='rankOrder top_rank']//li[2]"));
  act.dragAndDrop(keys3,keys4).build().perform();
  WebElement keys5 = driver.findElement(By.xpath("//span[text()='Dishonest or betray my trust']"));
  WebElement keys6 = driver.findElement(By.xpath("//div[@class='rankOrder top_rank']//li[3]"));
  act.dragAndDrop(keys5,keys6).build().perform();
  WebElement keys7 = driver.findElement(By.xpath("//span[text()='Over processing or pushy']"));
  WebElement keys8 = driver.findElement(By.xpath("//li[@class='draggedLast-value ui-droppable']")); 
  act.dragAndDrop(keys7,keys8).build().perform();
  WebElement button18 =driver.findElement(By.xpath("//a[@id='next1']"));
  js.executeScript("arguments[0].click();", button18);
  } catch(Exception e) {
	  	System.out.println(e);
	  }
  
  //qustion = 18
  try {
  WebElement clicking = driver.findElement(By.xpath("//span[text()='I identify as male']"));
  js.executeScript("arguments[0].click();", clicking);
  WebElement button19 =driver.findElement(By.xpath("//a[@id='next1']"));
  js.executeScript("arguments[0].click();", button19);
  } catch(Exception e) {
	  	System.out.println(e);
  }

 // qustion = 19
  try {
  WebElement clicking2 = driver.findElement(By.xpath("//span[normalize-space()='I follow one or more relationship experts']"));
  js.executeScript("arguments[0].click();", clicking2);
  WebElement button20 =driver.findElement(By.xpath("//a[@id='next1']"));
  js.executeScript("arguments[0].click();", button20);
	  	 } catch(Exception e) {
	 	  	System.out.println(e);
	  	 }
  
  // qustion = 20
  try {
  WebElement clicking3 = driver.findElement(By.xpath("//input[@placeholder='Type your answere here...']"));
  js.executeScript("arguments[0].value='ashley';", clicking3);
  WebElement button21 =driver.findElement(By.xpath("//a[@id='next1']"));
  js.executeScript("arguments[0].click();", button21);
	  	 } catch(Exception e) {
	 	  	System.out.println(e);
	  	 }
  Thread.sleep(2000);
  // qustion = 21
  try {
	  WebElement clicking4 = driver.findElement(By.xpath("//input[@name='question21']"));
	  js.executeScript("arguments[0].value='morgan';", clicking4);
  } catch(Exception e) {
	  	System.out.println(e);
	 }
	  WebElement button22 =driver.findElement(By.xpath("//a[@id='next1']"));
	  js.executeScript("arguments[0].click();", button22);
		  	 
  // qustion = 22

  try {
	  WebElement clicking5 = driver.findElement(By.xpath("//input[@placeholder='name@example.com']"));
	  js.executeScript("arguments[0].value='morgan@mailinator.com';", clicking5);
	  
	  WebElement button23 =driver.findElement(By.xpath("//input[@type='checkbox']"));
	  js.executeScript("arguments[0].click();", button23);
	  
	  WebElement button24 =driver.findElement(By.xpath("//a[@id='next1']")); 
	  js.executeScript("arguments[0].click();", button24);
		  	 } catch(Exception e) {
		 	  	System.out.println(e);
		  	 }
  // qustion = 23
  try {
	  WebElement clicking6 = driver.findElement(By.name("question23"));
	  js.executeScript("arguments[0].value='99999999';", clicking6);
	  
	  WebElement button25 =driver.findElement(By.xpath("//input[@type='checkbox']"));
	  js.executeScript("arguments[0].click();", button25);
	 
	  WebElement button26 =driver.findElement(By.xpath("//button[@name='sub_btn']"));
	  js.executeScript("arguments[0].click();", button26);
		  	 } 
  
  catch(Exception e) {
		 	  	System.out.println(e);
		  	 }
  Thread.sleep(3000);
  try {
  WebElement button27= driver.findElement(By.xpath("//a[text()=\"Yes\"]"));
  js.executeScript("arguments[0].click();", button27);
  
  } catch(Exception e) {
	  	System.out.println(e);
	 }
	
  WebElement report = driver.findElement(By.xpath("//div[7]//a[@class='btn btn-white-filled' and text()=' UPGRADE TO UNLOCK']"));
  js.executeScript("arguments[0].click();",report);
  Thread.sleep(2000);
  try {
	Alert alertwindow = driver.switchTo().alert();	
	   alertwindow.dismiss();
  // sign in
  WebElement names = driver.findElement(By.xpath("//input[@class='form-control ')]"));//email
  js.executeScript("arguments[0].value='jennifer@jennifersrussell.com';",names);
  
  WebElement passcode = driver.findElement(By.name("password")); // password
  js.executeScript("arguments[0].value='11111111';",passcode);
  
  WebElement submission = driver.findElement(By.xpath("//input[@type=\"submit\"]"));
  js.executeScript("arguments[0].click();",submission);
  } catch(Exception e) {
	  	System.out.println(e);
	 }
	
  
WebElement ex = driver.findElement(By.xpath("//div[@class='inner']"));
  File input = scrShot.getScreenshotAs(OutputType.FILE);
  File output = new File("C:\\Users\\iMark Admin\\Desktop\\Code editor\\seleniumproject\\Screenshot\\ex.png");
  FileUtils.copyFile(input,output);
  Thread.sleep(2000);
  
 // WebElement alerting  = driver.findElement(By.xpath("//a[@class='btn btn-primary']"));
  //alerting.click();
  
 // Alert alertwindow = driver.switchTo().alert();	
 // alertwindow.dismiss();
	
	}
  }


