package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FAQFeature {

	public WebDriver driver;
	public FAQFeature(WebDriver d)
	{
		driver=d;
	}
	public void FAQMethod() throws InterruptedException
	{
		driver.get("https://www.ultraviolette.com/faq");
		driver.manage().window().maximize();
//		WebElement PlusIcon=driver.findElement(By.xpath("//img[@alt='Add']"));
//		PlusIcon.click();
//        
		WebElement PlusIcon01 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div/div[3]/div[1]/div/div[2]/div[1]/img"));
		Thread.sleep(2000);
		PlusIcon01.click();
		Thread.sleep(2000);
		
		WebElement PlusIcon02 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div/div[3]/div[2]/div/div[2]/div[1]/img"));
		Thread.sleep(2000);
		PlusIcon02.click();
		Thread.sleep(2000);

		WebElement PlusIcon03 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div/div[3]/div[3]/div/div[2]/div[1]/img"));
		Thread.sleep(2000);
		PlusIcon03.click();
		Thread.sleep(2000);
		
		WebElement PlusIcon04 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div/div[3]/div[4]/div/div[2]/div[1]/img"));
		Thread.sleep(2000);
		PlusIcon04.click();
		Thread.sleep(2000);
		
		WebElement PlusIcon05 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div/div[3]/div[5]/div/div[2]/div[1]/img"));
		Thread.sleep(2000);
		PlusIcon05.click();
		Thread.sleep(2000);
		
		WebElement PlusIcon06 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div/div[3]/div[6]/div/div[2]/div[1]/img"));
		Thread.sleep(2000);
		PlusIcon06.click();
		Thread.sleep(2000);
		
		WebElement PlusIcon07 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div/div[3]/div[7]/div/div[2]/div[1]/img"));
		Thread.sleep(2000);
		PlusIcon07.click();
		Thread.sleep(2000);
		
		WebElement PlusIcon08 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div/div[3]/div[8]/div/div[2]/div[1]/img"));
		Thread.sleep(2000);
		PlusIcon08.click();
		Thread.sleep(2000);
		
		WebElement PlusIcon09 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div/div[3]/div[9]/div/div[2]/div[1]/img"));
		Thread.sleep(2000);
		PlusIcon09.click();
		Thread.sleep(2000);
		
		WebElement PlusIcon10 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div/div[3]/div[10]/div/div[2]/div[1]/img"));
		Thread.sleep(2000);
		PlusIcon10.click();
		Thread.sleep(2000);
		
		WebElement PlusIcon11 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div/div[3]/div[11]/div/div[2]/div[1]/img"));
		Thread.sleep(2000);
		PlusIcon11.click();
		Thread.sleep(2000);
		
		WebElement PlusIcon12 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div/div[3]/div[12]/div/div[2]/div[1]/img"));
		Thread.sleep(2000);
		PlusIcon12.click();
		Thread.sleep(2000);
		
		WebElement PlusIcon13 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div/div[3]/div[13]/div/div[2]/div[1]/img"));
		Thread.sleep(2000);
		PlusIcon13.click();
		Thread.sleep(2000);
		
		WebElement PlusIcon14 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div/div[3]/div[14]/div/div[2]/div[1]/img"));
		Thread.sleep(2000);
		PlusIcon14.click();
		Thread.sleep(2000);
		
		WebElement PlusIcon15 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div/div[3]/div[15]/div/div[2]/div[1]/img"));
		Thread.sleep(2000);
		PlusIcon15.click();
		Thread.sleep(2000);
		
		WebElement PlusIcon16 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div/div[3]/div[16]/div/div[2]/div[1]/img"));
		Thread.sleep(2000);
		PlusIcon16.click();
		Thread.sleep(2000);
		
		WebElement PlusIcon17 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div/div[3]/div[17]/div/div[2]/div[1]/img"));
		Thread.sleep(2000);
		PlusIcon17.click();
		Thread.sleep(2000);
		
		WebElement PlusIcon18 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div/div[3]/div[18]/div/div[2]/div[1]/img"));
		Thread.sleep(2000);
		PlusIcon18.click();
		Thread.sleep(2000);
		
		WebElement PlusIcon19 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div/div[3]/div[19]/div/div[2]/div[1]/img"));
		Thread.sleep(2000);
		PlusIcon19.click();
		Thread.sleep(2000);
		
		WebElement PlusIcon20 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div/div[3]/div[20]/div/div[2]/div[1]/img"));
		Thread.sleep(2000);
		PlusIcon20.click();
		Thread.sleep(2000);
		
		WebElement PlusIcon21 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div/div[3]/div[21]/div/div[2]/div[1]/img"));
		Thread.sleep(2000);
		PlusIcon21.click();
		Thread.sleep(2000);
		
		WebElement PlusIcon22 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div/div[3]/div[22]/div/div[2]/div[1]/img"));
		Thread.sleep(2000);
		PlusIcon22.click();
		Thread.sleep(2000);
		
		WebElement PlusIcon23 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div/div[3]/div[23]/div/div[2]/div[1]/img"));
		Thread.sleep(2000);
		PlusIcon23.click();
		Thread.sleep(2000);
		
		WebElement PlusIcon24 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div/div[3]/div[24]/div/div[2]/div[1]/img"));
		Thread.sleep(2000);
		PlusIcon24.click();
		Thread.sleep(2000);
		
		WebElement PlusIcon25 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div/div[3]/div[25]/div/div[2]/div[1]/img"));
		Thread.sleep(2000);
		PlusIcon25.click();
		Thread.sleep(2000);
		
		WebElement PlusIcon26 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div/div[3]/div[26]/div/div[2]/div[1]/img"));
		Thread.sleep(2000);
		PlusIcon26.click();
		Thread.sleep(2000);
		
		
		
		
	}

}
