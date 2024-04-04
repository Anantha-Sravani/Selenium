package Sample;

import java.time.Duration;
import java.util.Set;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ConfigurePage {
	public WebDriver driver;
	public ConfigurePage(WebDriver d)
	{
		driver=d;
	}
	public void ConfigureMethod() throws InterruptedException
	{

		driver.get("https://www.ultraviolette.com/configure");
		int i=1;
			while(i<=2)
			{
		        driver.findElement(By.xpath("//div[@class='absolute flex justify-center items-center top-[25vh] sm:top-[47vh] right-0 cursor-pointer z-20 w-[50px] sm:w-[80px] h-[80px]']")).click();
		        Thread.sleep(2000);
		       i++;
			}
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[text()='NEXT']")).click();
			
			Thread.sleep(2000);
		for(int x=1;x<=4;x++)
		{
		WebElement NextButton=driver.findElement(By.xpath("//div[@class='absolute right-4 z-50 cursor-pointer']"));
		
		NextButton.click();
		Thread.sleep(1000);
		}
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//div[text()='Compare variants']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='ClosableGridPanel_close__z_WSu']")).click();
		Thread.sleep(2000);
		
        driver.findElement(By.xpath("//div[text()='Exchange']")).click();
        Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='absolute right-7 top-7 cursor-pointer']")).click();
		Thread.sleep(2000);
				
		driver.findElement(By.xpath("//div[text()='Rollout Calendar']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='SIGN IN TO BRING US TO YOUR CITY']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class='signin_input__7mAAh']")).sendKeys("sravsanantha7@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='PROCEED']")).click();
		Thread.sleep(20000);
		driver.findElement(By.xpath("//img[@alt='cross']")).click();
		Thread.sleep(2000);
		
//		driver.findElement(By.xpath("//button[@class='minimal-toolbar_iconButton__hBqdp']")).click();
//		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Potential Savings']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@alt='cross']")).click();
		Thread.sleep(3000);
		for(int a=1;a<=2;a++)
		{
          driver.findElement(By.xpath("//img[@alt='arrow white']")).click();
          Thread.sleep(2000);
		}
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//div[text()='CONFIRM CONFIGURATION']")).click();
		Thread.sleep(2000);
		
		
       WebElement check_box = driver.findElement(By.xpath("//a[text()='Booking agreement']"));
       Thread.sleep(4000);
       
      String parentWindow = driver.getWindowHandle();
      System.out.println("parent windoe id is :" + parentWindow);
       check_box.click();
       Thread.sleep(3000);
       Set<String> childWindows =driver.getWindowHandles();
       for (String childWindow : childWindows) 
       {
		System.out.println(childWindow);
		if(!childWindow.equals(parentWindow))
		{
			driver.switchTo().window(childWindow);
		}
	   }
       JavascriptExecutor jse =  (JavascriptExecutor)driver;
       jse.executeScript("window.scrollTo(0,2500)");
       Thread.sleep(5000);
       driver.close();
       Thread.sleep(3000);
       
       driver.findElement(By.xpath("//input[@type='checkbox']")).click();
       Thread.sleep(3000);
       
       
       
       
      
//       check_box.click();
		
		 
		//img[@alt='arrow-right']
		//div[text()='PAY INR 25000']
		 
		 //driver.quit();
//		 
//		 WebElement next =driver.findElement(By.xpath("//div[@class='text_meduim__4JhLl text_white__TnMdl text_brutal__Oumhh']"));
//		 next.click();
//		 Thread.sleep(2000);
//		 
//		 WebElement ACCESSORIES =driver.findElement(By.xpath("//div[@class='text_regular__WK7vV text_black__pykLK text_brutal__Oumhh mt-1']"));
//		 ACCESSORIES.click();
//		 Thread.sleep(2000);
//		 
//		 driver.findElement(By.xpath("//div[@class='cards_variantCard__jPRTB  cards_selected__01vri cursor-pointer']")).click();
//		 
//		 Thread.sleep(2000);
//		 driver.findElement(By.xpath("//div[text()='NEXT']")).click();
//		 Thread.sleep(2000);
//		 
//		 driver.findElement(By.xpath("//div[text()='Upgrade to 8 year warranty.']")).click();
//		 Thread.sleep(2000);
//		 driver.findElement(By.xpath("//div[text()='CONFIRM CONFIGURATION']")).click();
//		 Thread.sleep(4000);
//		 driver.findElement(By.xpath("//div[@class='signin_disketmono__T8Gs_ text-sm cursor-pointer top-16 z-50 mt-2 absolute sm:cursor-pointer sm:relative  sm:top-0']")).click();
//		 Thread.sleep(4000);
//		WebElement RollOutCallender =driver.findElement(By.xpath("//div[text()='Rollout Calendar']"));
//		RollOutCallender.click();
//		
//		WebElement Sign_IN =driver.findElement(By.xpath("//div[text()='SIGN IN TO BRING US TO YOUR CITY']"));
//		 Sign_IN.click();
//		 
//		 Actions act = new Actions(driver); 
//		 WebElement email =driver.findElement(By.xpath("//input[@placeholder='ENTER EMAIL']"));
//		 Thread.sleep(4000);
//		act.moveToElement(email).click().sendKeys("sravsanantha7@gmail.com").build().perform();
//		Thread.sleep(2000);
//		 WebElement checkbox1 =driver.findElement(By.xpath("//input[@type='checkbox']"));
//		 checkbox1.click();
		

	}

}
