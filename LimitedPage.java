package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LimitedPage {
	public WebDriver driver;
	public LimitedPage(WebDriver d)
	{
		driver=d;
	}
	public void LimitedMethod() throws InterruptedException
	{
	driver.get("https://www.ultraviolette.com/limited");
//		JavascriptExecutor jse =(JavascriptExecutor)driver;
//		jse.executeAsyncScript("window.scrollTo(0,3750)");
//		Thread.sleep(2000);
		
		 WebElement Download=driver.findElement(By.xpath("//div[text()='DOWNLOAD FULL SPECIFICATION']"));
		 Download.click();
		 Thread.sleep(2000);
		WebElement mobileField = driver.findElement(By.id("phone-text"));
		mobileField.sendKeys("28387484895");
		System.out.println("11 digit mobile number should not accept");
		mobileField.clear();
		mobileField.sendKeys("6305961502");
		
		WebElement NotifyButton =driver.findElement(By.xpath("//button[text()='Notify']"));
		NotifyButton.click();
		System.out.println("Thank you message should occur");
		
				

	}

}
