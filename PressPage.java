package Sample;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PressPage {
	public WebDriver driver;
	public PressPage(WebDriver d)
	{
		driver=d;
	}
	public void PressMethod() throws InterruptedException
	{
		driver.get("https://www.ultraviolette.com/press");
		WebElement subscribeOption =driver.findElement(By.xpath("//div[text()='SUBSCRIBE']"));
		subscribeOption.click();
		WebElement EmailTextField =driver.findElement(By.id("enteredEmailId"));
		EmailTextField.sendKeys("Sravsantha7");
		EmailTextField.clear();
		Thread.sleep(5000);
		EmailTextField.sendKeys("sravsanantha@gmail.com");
		
		Thread.sleep(2000);
		WebElement subscribe =driver.findElement(By.xpath("//button[text()='SUBSCRIBE']"));
		subscribe.click();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollTo(800,0)");
		Thread.sleep(2000);
		WebElement veiw =driver.findElement(By.xpath("//button[@class='Button_button__Stqur pt-2 pb-[7px] pl-8 pr-8 ']"));
		veiw.click();
		Thread.sleep(2000);
		
		WebElement subscribeTo =driver.findElement(By.xpath("//div[text()='SUBSCRIBE TO OUR YOUTUBE']"));
		String parentWindow = driver.getWindowHandle();
		System.out.println("parent window id is :" + parentWindow);
//	      Thread.sleep(3000);
		subscribeTo.click();
//	  	jse.executeAsyncScript("window.scrollTo(0,2000)");
//		jse.executeAsyncScript("window.scrollTo(2000,4000)");
//		jse.executeAsyncScript("window.scrollTo(4000,8000)");
//	jse.executeAsyncScript("window.scrollTo(8000,0)");
	       Thread.sleep(3000);
	       Set<String> childWindows =driver.getWindowHandles();
	       for (String childWindow : childWindows) 
	       {
			System.out.println(childWindow);
			if(!childWindow.equals(parentWindow))
			{
				driver.switchTo().window(parentWindow);
			}
		   }
		
		
	
	
		Thread.sleep(4000);
		

	}

}
