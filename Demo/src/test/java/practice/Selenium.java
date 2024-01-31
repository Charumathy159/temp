package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/text-box");
		
		driver.findElement(By.xpath("//input[@id = 'userName' and @placeholder='Full Name']")).sendKeys("Charu");
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Charu@gmail.com");
		
		driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("Guduvancheri");
		
		driver.findElement(By.xpath("//textarea[@id='permanentAddress']")).sendKeys("Guduvancheri");
		 
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,250)", "");
		WebElement submit = driver.findElement(By.id("submit"));
		js.executeScript("arguments[0].scrollIntoView();", submit);
		submit.click();
		
		
		
		WebElement Output = driver.findElement(By.xpath("//div[@class='border col-md-12 col-sm-12']"));
		
		
		System.out.println(Output.getText()); 
		
		//checkboxes 
		
		
		
		WebElement Checkbox = driver.findElement(By.xpath("//span[text()='Check Box']"));
		
		Checkbox.click();
		
		WebElement HomeExpand = driver.findElement(By.xpath("//button[@title='Toggle' and @class='rct-collapse rct-collapse-btn']"));
		
		js.executeScript("arguments[0].scrollIntoView();",HomeExpand );
		HomeExpand.click();
		
		WebElement Expand = driver.findElement(By.xpath("//button[@class='rct-option rct-option-expand-all']"));
		Expand.click();
		WebElement Home = driver.findElement(By.xpath("//span[text()='Home']"));
		
		Home.click();
		
		boolean result = Home.isSelected();
		boolean result1 = Home.isDisplayed();
		
		
		System.out.println(driver);
		
		System.out.println(result);
		System.out.println(result1);
		//Radio button
		
		WebElement RadioButton = driver.findElement(By.xpath("//span[text()='Radio Button']"));
		
		RadioButton.click();
		
		
		
	WebElement impressive=	driver.findElement(By.xpath("//label[@for='impressiveRadio']"));
	
	Thread.sleep(2000);
	impressive.click();
		boolean result2 = RadioButton.isSelected();
		Thread.sleep(5000);
		System.out.println(result2);
		Thread.sleep(50000);
	//	driver.quit();
			
		
		
		
		
		

	}

}
