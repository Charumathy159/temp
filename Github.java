package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Github {
	
	public static void main (String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://igvenkatesh.github.io/simpleHtmlDemoPage/");
		
		driver.findElement(By.id("fname")).clear();
		
		driver.findElement(By.id("fname")).sendKeys("Charumathy");
		
		driver.findElement(By.id("lname")).clear();
		
		driver.findElement(By.id("lname")).sendKeys("V");
		
		driver.findElement(By.name("newsletter")).click();
		
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		
		Thread.sleep(60000);
		driver.close();
		
		
		
		//out
		
		
		
		
		
	}
	

}
