package Sample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class F77Page extends BaseClass{

public WebDriver driver;
public F77Page(WebDriver d)
{
	driver=d;
}
public void F77Method() throws InterruptedException
{

	//public static void main(String[] args) throws InterruptedException {
	driver.get("https://www.ultraviolette.com/");
	Thread.sleep(2000);


		WebElement arrowMark = driver.findElement(By.xpath("//div[@class='Home_configureName__EtOXK']"));
		arrowMark.click();
		Thread.sleep(3000);
		System.out.println("Configuration page should be open");
		driver.navigate().back();
		// driver.get("https://www.ultraviolette.com/");

		WebElement downloadOption = driver.findElement(By.xpath("//div[text()='DOWNLOAD FULL SPECIFICATION']"));
		downloadOption.click();
		System.out.println("PDF should be download");
		Thread.sleep(3000);

		WebElement PlayButton = driver.findElement(By.xpath("//div[@class='sound_play-button__f45ej']"));
		PlayButton.click();
		Thread.sleep(3000);

		WebElement dragelement = driver.findElement(By.xpath("//div[@id='show1']"));
		WebElement dragelement1 = driver.findElement(By.xpath("//div[@id='show2']"));
		WebElement dragelement2 = driver.findElement(By.xpath("//div[@id='show3']"));
		WebElement dragelement3 = driver.findElement(By.xpath("//div[@id='show4']"));
		Actions action = new Actions(driver);
		action.dragAndDrop(dragelement,dragelement1).perform();
		Thread.sleep(3000);
		action.dragAndDrop(dragelement2,dragelement3).perform();
		Thread.sleep(3000);
//		action.dragAndDrop(dragelement3,dragelement2).perform();
//		Thread.sleep(2000);
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollTo(5000,6300)");
		
//		WebElement drageimage= driver.findElement(By.xpath("//video[@id='drageimage']"));
//		WebElement drageimage1 = driver.findElement(By.xpath("//video[@id='hampi_video']"));
//		WebElement drageimage2 = driver.findElement(By.xpath("//video[@id='kannur_video']"));
//		action.dragAndDrop(dragelement,dragelement1).perform();
//		Thread.sleep(2000);
//		action.dragAndDrop(dragelement,dragelement1).perform();
//		Thread.sleep(2000);
//		action.dragAndDrop(dragelement1,dragelement2).perform();
//		Thread.sleep(2000);
		
		
		WebElement LimitedArrowMark = driver.findElement(By.xpath("//img[@alt='arrowRoundedBlack']"));
		LimitedArrowMark.click();
		Thread.sleep(3000);
		System.out.println("LimitedPage should be Open ");
		Thread.sleep(2000);

		WebElement DownloadInLimitedPage = driver.findElement(By.xpath("//div[text()='DOWNLOAD FULL SPECIFICATION']"));
		DownloadInLimitedPage.click();
		System.out.println("LimitedPage Download ");
		Thread.sleep(5000);
		WebElement NotifyOption1 = driver.findElement(By.xpath("//button[text()='Notify']"));
		NotifyOption1.click();
		WebElement PhoneNumberTextFeild = driver.findElement(By.xpath("//input[@id='phone-text']"));
		PhoneNumberTextFeild.sendKeys("6305961502");
		Thread.sleep(1000);

		WebElement NotifyOption = driver.findElement(By.xpath("//button[text()='Notify']"));
		NotifyOption.click();
		driver.navigate().back();
		Thread.sleep(1000);

		WebElement BikeObject2 = driver.findElement(By.xpath("//img[@alt='AIR INTAKES']"));
		WebElement BikeIndicators = driver.findElement(By.xpath("//img[@alt='INDICATORS']"));
		action.dragAndDrop(BikeObject2, BikeIndicators).perform();
		Thread.sleep(1000);
		action.dragAndDrop(BikeIndicators, BikeObject2).perform();
		Thread.sleep(1000);

		//JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollTo(0,10000)");
		Thread.sleep(2000);

		jse.executeScript("window.scrollTo(10000,0)");
		
		driver.findElement(By.xpath("//a[text()=' Whatsapp']")).click();

	}

}
