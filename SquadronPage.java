package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SquadronPage {

	public WebDriver driver;
	public SquadronPage(WebDriver d)
	{
		driver=d;
	}
	public void SquadronMethod() throws InterruptedException
	{
		driver.get("https://www.ultraviolette.com/squadron");
		WebElement leaderboardButton =driver.findElement(By.xpath("//button[text()='GO TO LEADERBOARD']"));
		leaderboardButton.click();
		Thread.sleep(4000);
		JavascriptExecutor jsex = (JavascriptExecutor)driver;
		jsex.executeScript("window.scrollTo(0,1000)");
		Thread.sleep(2000);
		jsex.executeScript("window.scrollTo(1000,2000)");
		Thread.sleep(2000);
		jsex.executeScript("window.scrollTo(2000,500)");
		Thread.sleep(4000);
		//Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
//		driver.get("https://www.ultraviolette.com/squadron");
//		Thread.sleep(4000);
		jsex.executeScript("window.scrollTo(0,3000)");
		WebElement wallpapers =driver.findElement(By.xpath("//span[text()='EXPLORE WALLPAPERS']"));
		wallpapers.click();
		Thread.sleep(4000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollTo(0,1500)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollTo(1500,2500)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollTo(2500,3500)");
		driver.navigate().back();


		
		
				

	}

}
