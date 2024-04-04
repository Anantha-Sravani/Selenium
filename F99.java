package Sample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class F99 {
public WebDriver driver;
public F99(WebDriver d)
{
	driver=d;
}
	public void F99Method()
	{
		
		driver.get("https://www.ultraviolette.com/f99");
		WebElement element =driver.findElement(By.xpath("//div[text()='I am Interested']"));
		element.click();
//		WebElement NameTextfield =driver.findElement(By.xpath("//input[@placeholder='FULL NAME']"));
		Actions action = new Actions(driver);
//		NameTextfield.sendKeys("Pinky122345");
		WebElement name = driver.findElement(By.id("enteredFullName"));
		action.moveToElement(name).click().sendKeys("sravani").perform();
		//country.click();
		//country.sendKeys("India");
		
		WebElement country = driver.findElement(By.xpath("//div[text()='COUNTRY']"));
		action.moveToElement(country).click().sendKeys("AFGHANISTAN").sendKeys(Keys.ENTER).perform();
		WebElement StateOption =driver.findElement(By.xpath("//div[text()='STATE']"));
		action.moveToElement(StateOption).click().sendKeys("Ghazni").sendKeys(Keys.ENTER).perform();
		WebElement pincode =driver.findElement(By.id("enteredPincode"));
		pincode.sendKeys("123456");
		WebElement phone =driver.findElement(By.id("phone-text"));
		phone.sendKeys("7123456789");
		 WebElement email = driver.findElement(By.id("enteredEmailId"));
		 email.sendKeys("sravs123@gmail.com");
		 WebElement nextButton =driver.findElement(By.xpath("//div[text()='NEXT']"));
		 nextButton.click();
	
		

	}

}
