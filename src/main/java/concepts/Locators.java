package concepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
//import org.junit.Before;
//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
	WebDriver driver;
	
	@Before
	public void init() {
		
		System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://objectspy.space/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	@Test
	public void testLocators() {
		
		driver.findElement(By.name("firstname")).sendKeys("Selenium");
		driver.findElement(By.id("exp-0")).click();
		//driver.findElement(By.input("datepicker")).click();  for date select
		
		//upload photo
		driver.findElement(By.id("photo")).sendKeys("D:\\Study Material\\Java_class1.pptx");
		
		//link text
	//	driver.findElement(By.linkText("files.zip")).click();
	//	driver.findElement(By.linkText("OS-API Product FrontEnd")).click();
		
		//search for partial match element which is 1-1 unique
	//	driver.findElement(By.partialLinkText("FrontEnd")).click();
		
		//css (TagName#Value, # is ID)
		driver.findElement(By.cssSelector("input#sex-0")).click();
		
		//css (TagName[attribute = ‘value’])
		driver.findElement(By.cssSelector("input[id='profession-1']")).click();
		
		//css (TagName[href$=‘value’])
	//	driver.findElement(By.cssSelector("a[href$='http://techfios.com/api-prod/api_site/']")).click();

		//xpath for absolute
		driver.findElement(By.xpath("html/body/div/div[2]/div[2]/form/div[1]/a/strong")).click();
	}
}
