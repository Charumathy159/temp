package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TestNg_Example {

	WebDriver driver;
	@Test(priority=0)
	public void LaunchBrowser()
	{
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	}
	@Test(priority=1)
	public void LoadPage()
	{
		driver.get("https://demo.automationtesting.in/Register.html");
	}
	@Test(priority=2)
	public void Fullname()
	{
		WebElement Firstname = driver.findElement(By.xpath("//input[@ng-model='FirstName']"));
		Firstname.sendKeys("Charumathy");
		WebElement LastName = driver.findElement(By.xpath("//input[@ng-model='LastName']"));
		LastName.sendKeys("V");
		
	}
	
	@Test(priority=3)
	public void Address()
	{
		WebElement Address = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
		Address.sendKeys("Guduvancheri");
		
	}
	
	@Test(priority=4)
	public void Email()
	{
		WebElement Email = driver.findElement(By.xpath("//input[@ng-model='EmailAdress']"));
		Email.sendKeys("charu@gmail.com");
	}
	@Test(priority=5)
	public void Phone()
	{
		WebElement Phone = driver.findElement(By.xpath("//input[@ng-model='Phone']"));
		Phone.sendKeys("9876543210");
	}
	@Test(priority=6)
	public void Gender()
	{
		WebElement GenderButton = driver.findElement(By.xpath("//input[@value='FeMale']"));
		
		GenderButton.click();
	}
	@Test(priority=7)
	public void Hobbies()
	{
		WebElement Movies = driver.findElement(By.xpath("//input[@value='Movies']"));
		Movies.click();
		
	}
	@Test(priority=10)
	public void Languages() throws InterruptedException
	{
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	
		
		WebElement Languages = driver.findElement(By.xpath("//div[@id='msdd']"));
		
	//	wait.until(ExpectedConditions.elementToBeClickable(Languages));
		
		//Languages.sendKeys("English,Tamil");
		
		
	}
	
}
