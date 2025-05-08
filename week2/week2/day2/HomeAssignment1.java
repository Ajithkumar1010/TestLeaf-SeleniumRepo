package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.Select;

public class HomeAssignment1 {

	public static void main(String[] args) {


		EdgeOptions options=new EdgeOptions();
		options.addArguments("guest");
		
		WebDriver driver =new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		//entering username
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		
		//entering password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		
		//clicking submit
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		
		//clicking crmsfa
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		
		//clicking account
		driver.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();
		
		//clicking create account
		driver.findElement(By.linkText("Create Account")).click();
		
		//Entering an account name
		driver.findElement(By.id("accountName")).sendKeys("Test Leaf1");
		
		//Entering a description
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");
		
		//Selecting  industry
		
		WebElement industry=driver.findElement(By.xpath("//select[@name='industryEnumId']"));
		Select obj1= new Select(industry);
		obj1.selectByVisibleText("Computer Software");
		
		//Selecting  ownership 
		
		WebElement ownership=driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
		Select obj2= new Select(ownership);
		obj2.selectByVisibleText("S-Corporation");
		
		
		//Selecting source 
		
		WebElement source =driver.findElement(By.id("dataSourceId"));
		Select obj3= new Select(source);
		obj3.selectByValue("LEAD_EMPLOYEE");
		
		
		//Selecting the marketing campaign 
		
		WebElement marketing =driver.findElement(By.id("marketingCampaignId"));
		Select obj4= new Select(marketing);
		obj4.selectByIndex(7);
		
		//Selecting state/province 
		
		WebElement state =driver.findElement(By.id("generalStateProvinceGeoId"));
		Select obj5= new Select(state);
		obj5.selectByValue("TX");
		
		
		//Click the "Create Account" button. 
		driver.findElement(By.xpath("//input[contains(@onclick, 'submitFormWithSingleClick')]")).click();
		
		driver.close();
		
		
		
	
	}

}
