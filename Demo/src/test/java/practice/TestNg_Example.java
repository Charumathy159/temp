package practice;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
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
		System.out.println("Page Loaded");
	}
	@Test(priority=2)
	public void Fullname()
	{
		WebElement Firstname = driver.findElement(By.xpath("//input[@ng-model='FirstName']"));
		Firstname.sendKeys("Charumathy");
		WebElement LastName = driver.findElement(By.xpath("//input[@ng-model='LastName']"));
		LastName.sendKeys("V");
		System.out.println("Fullname Entered");
		
	}
	
	@Test(priority=3)
	public void Address()
	{
		WebElement Address = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
		Address.sendKeys("Guduvancheri");
		System.out.println("Address Entered");
		
	}
	
	@Test(priority=4)
	public void Email()
	{
		WebElement Email = driver.findElement(By.xpath("//input[@ng-model='EmailAdress']"));
		Email.sendKeys("charu@gmail.com");
		System.out.println("Email Entered");
	}
	@Test(priority=5)
	public void Phone()
	{
		WebElement Phone = driver.findElement(By.xpath("//input[@ng-model='Phone']"));
		Phone.sendKeys("9876543210");
		System.out.println("Phone Entered");
	}
	@Test(priority=6)
	public void Gender()
	{
		WebElement GenderButton = driver.findElement(By.xpath("//input[@value='FeMale']"));
		
		GenderButton.click();
		
		System.out.println("gender Entered");
	}
	@Test(priority=7)
	public void Hobbies()
	{
		WebElement Movies = driver.findElement(By.xpath("//input[@value='Movies']"));
		Movies.click();
		System.out.println("Hobbies Entered");
	}
	@Test(priority=10)
	public void Languages() throws InterruptedException
	{
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement Languages = driver.findElement(By.xpath("//div[@id='msdd']"));
		
		Languages.click();
		 
		WebElement chooseLanguage = driver.findElement(By.xpath("//li/a[text()='English']"));
		
		chooseLanguage.click();
		
		System.out.println("Language Entered");
	
		
	}
	
	@Test(priority=11)
	public void Skills ()
	{
		WebElement Skills = driver.findElement(By.xpath("//select[@ng-model='Skill']"));
		
		Select Skill = new Select(Skills);
		
		Skill.selectByVisibleText("Java");
	
		System.out.println("Skill Entered");
	}
	
	@Test(priority=12)
	public void Country()
	{
		WebElement Countries  = driver.findElement(By.xpath("//select[@id='countries']"));
		
		Select Country = new Select(Countries);
		
		Country.selectByVisibleText("Select Country");
		
		
		
		WebElement SelectCountry = driver.findElement(By.xpath("//span[@role='combobox']"));		
		
		SelectCountry.click();
		
		driver.findElement(By.xpath("//li[text()='India']")).click();
		System.out.println("Country Entered");
	}
	
	@Test(priority=13)
	public void DOB()
	
	{
		WebElement YearBox = driver.findElement(By.xpath("//select[@id='yearbox']"));
		Select Year = new Select (YearBox);
		Year.selectByVisibleText("2000");
		
		WebElement MonthBox = driver.findElement(By.xpath("//select[@ng-model='monthbox']"));
		Select Month = new Select (MonthBox);
		Month.selectByVisibleText("September");
		
		WebElement DayBox = driver.findElement(By.xpath("//select[@ng-model='daybox']"));
		Select Day = new Select (DayBox);
		Day.selectByVisibleText("15");
		
		System.out.println("DOB Entered");
	}
	@Test(priority=14)
	public void password ()
	
	{
		WebElement Password = driver.findElement(By.xpath("//input[@id='firstpassword']"));
		
		Password.sendKeys("Charu@@@");
		
		System.out.println("Password Entered");
	}
	
	@Test(priority=15)
	public void confirm ()
	
	{
		WebElement Confirm = driver.findElement(By.xpath("//input[@id='secondpassword']"));
		
		Confirm.sendKeys("Charu@@@");
		
		System.out.println("Confirm password Entered");
	}

	@Test(priority=16)
	public void Submit()
	{
		WebElement Submit = driver.findElement(By.xpath("//button[@id='submitbtn']"));
		
		Submit.click();
		
		System.out.println("Submit Clicked");
		
	}
	
	@Test(priority=110)
	public void close()
	
	{
		driver.quit();
	}
	
}
