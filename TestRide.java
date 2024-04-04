package Sample;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestRide {
	public WebDriver driver;
	public TestRide(WebDriver d)
	{
		driver=d;
	}
	
	public void TestRideMethod() throws InterruptedException
	{
		driver.get("https://www.ultraviolette.com/testride");
		Thread.sleep(2000);
		
		WebElement firstnameTextField =driver.findElement(By.id("enteredFirstName"));
		Thread.sleep(2000);
		firstnameTextField.sendKeys("Sravani");
		Thread.sleep(2000);
		
		WebElement LastNameTextField =driver.findElement(By.id("enteredLastName"));
		LastNameTextField.sendKeys("Anantha");
		Thread.sleep(2000);
		
		WebElement MobileTextFeild =driver.findElement(By.xpath("//input[@id='phone-text']"));
		MobileTextFeild.sendKeys("6305961502");
		Thread.sleep(2000);
		
		 WebElement EmailTextFeild =driver.findElement(By.id("enteredEmailId"));
		 EmailTextFeild.sendKeys("sravsanantha7@gmail.com");
		 Thread.sleep(4000);
//		 JavascriptExecutor jse = (JavascriptExecutor)driver;
//		WebElement selectAll = driver.findElement(By.xpath("//div[@class='px-7 md:px-20 pb-20']"));
//		selectAll.click();
//		jse.executeScript("window.scrollTo(0,2000)");
		 Thread.sleep(7000);
		 Actions act = new Actions(driver);
		WebElement city=driver.findElement(By.xpath("//div[@class='h-14 sm:h-16 dropdown_Selector css-c8n4pz-control']"));
		city.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='BENGALURU']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='Button_button__Stqur paymentBtn ']")).click();
		Thread.sleep(2000);
		
		//act.moveToElement(city).click().sendKeys("BENGALURU").sendKeys(Keys.ENTER).build().perform();
//		Actions action =new Actions(driver); 
//		//Actions action1 =new Actions(driver); 
//		WebElement countryOption =driver.findElement(By.xpath("//div[text()='BENGALURU']"));
//		action.scrollToElement(countryOption).click().perform();
		//div[text()='CITY']
		
		
		 
		//div[@class=' css-tvqo4t-placeholder']
	
//		
//		WebElement snapshot_list = driver.findElement(By.id("//div[text()='BENGALURU']"));
//		Actions scrolldown = new Actions(driver);
//
//		scrolldown.moveToElement(snapshot_list).build().perform();
//		snapshot_list.click();
//
//		scrolldown.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		
//		WebElement eleAssistanceInput = driver.findElement(By.id("//div[@class=' css-19bb58m']"));
//		//the above element will be visible after scrolling down the div.                       
//		                        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", eleAssistanceInput);
//
//		                        eleAssistanceInput.click();
		
		

	}

}
