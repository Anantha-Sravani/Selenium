package Sample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Sign_In_Page {
	public WebDriver driver;
	public Sign_In_Page(WebDriver d)
	{
		driver=d;
	}
	public void SignInMethod() throws InterruptedException
	{
		driver.get("https://www.ultraviolette.com/signin");
		 WebElement EmailTextFeild=driver.findElement(By.xpath("//input[@placeholder='ENTER EMAIL']"));
			
	        EmailTextFeild.sendKeys("lalnidhinp02@gmail.com");
	        Thread.sleep(1000);
	        
	        WebElement CheckBox=driver.findElement(By.xpath("//input[@type='checkbox']"));
	        CheckBox.click();
	        Thread.sleep(1000);
	        
	      
	        WebElement ProceedButton =driver.findElement(By.xpath("//div[text()='PROCEED']"));
	        
	        ProceedButton.click();
	        Thread.sleep(15000);
	        
	        Actions act = new Actions(driver);
	        WebElement firstname  =driver.findElement(By.xpath("//input[@placeholder='FIRST AND LAST NAME']"));
	        act.moveToElement(firstname).click().sendKeys("sravani anantha").build().perform();
	        
//	        firstname.click();
//	        Thread.sleep(2000);
//	        firstname.sendKeys("sravani");
//	        Thread.sleep(2000);
//	        
	        WebElement age  =driver.findElement(By.xpath("//input[@placeholder='AGE']"));
	        age.sendKeys("55");
	        Thread.sleep(1000);
	        
	        WebElement gender  =driver.findElement(By.xpath("//option[text()='GENDER']"));
	        gender.click();
	        Thread.sleep(1000);
	        
	        WebElement gender_selection  =driver.findElement(By.xpath("//option[text()='Female']"));
	        gender_selection.click();
	        Thread.sleep(1000);
	        
	       WebElement state = driver.findElement(By.xpath("//option[text()='STATE']"));
	       state.click();
	       Thread.sleep(1000);
	        
	        WebElement select_State   =driver.findElement(By.xpath("//option[text()='Andhra Pradesh']"));
	        select_State .click();
	        Thread.sleep(1000);
	        
	        WebElement pincode   =driver.findElement(By.xpath("//input[@placeholder='PINCODE']"));
	        pincode .sendKeys("150654");
	        Thread.sleep(1000);
	        
	        WebElement phone_Number  =driver.findElement(By.xpath("//input[@placeholder='PHONE NUMBER']"));
	        phone_Number.sendKeys("6305961502");
	        Thread.sleep(1000);
	        
	        WebElement proceed_button  =driver.findElement(By.xpath("//div[text()='PROCEED']"));
	        act.doubleClick(proceed_button).doubleClick().build().perform();
	        Thread.sleep(1000);
	}
	       
	}


