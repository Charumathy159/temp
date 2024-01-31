package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsPractice {
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		WebElement SimpleAlert = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		
		SimpleAlert.click();
		
		Thread.sleep(1000);
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@class='analystic' and @href='#CancelTab']")).click();
		
		WebElement ConfirmAlert = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
	
		
		
		ConfirmAlert.click();
		
		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
		
		WebElement PromptAlert =driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		
		PromptAlert.click();
		

		
Alert alert =driver.switchTo().alert();

alert.sendKeys("charu");


System.out.println(alert.getText());
alert.accept();


driver.navigate().to("https://demo.automationtesting.in/Windows.html");
Thread.sleep(10000);

	driver.quit();	
		//alert
		
		
		
		
		
		
		
	}

}
