package week6.day1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SalesforceName extends SalesforceBase {
	
	public static String name="Salesforce Automation";
	
	@Test
	public void name() throws InterruptedException {
	
//	    Login to https://login.salesforce.com 
//		Username: bhuvanesh.moorthy@testleaf.com
//		Password: Leaf@2025
//		Click on the toggle menu button from the left corner
//		Click View All and click Legal Entities from App Launcher
//		Click on the Dropdown icon in the legal Entities tab
//		Click on New Legal Entity
//		Enter Name as 'Salesforce Automation by *Your Name*'
//		Click save and verify Legal Entity Name
	
		/*
		 * EdgeOptions options= new EdgeOptions(); options.addArguments("--private");
		 * EdgeDriver driver=new EdgeDriver(options);
		 * driver.manage().window().maximize();
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 * WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		 * JavascriptExecutor js= (JavascriptExecutor) driver;
		 * 
		 * //Launching url driver.get("https://login.salesforce.com/");
		 * 
		 * //entering username
		 * driver.findElement(By.xpath("//input[@id='username']")).sendKeys(
		 * "bhuvanesh.moorthy@testleaf.com");
		 * 
		 * //entering password
		 * driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Leaf@2025")
		 * ;
		 * 
		 * //click login driver.findElement(By.xpath("//input[@id='Login']")).click();
		 * 
		 * //click toggle WebElement toggle=
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
		 * "//div[@class='slds-icon-waffle']")));
		 * js.executeScript("arguments[0].click();", toggle);
		 * 
		 * //click viewall WebElement viewAll =
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.
		 * xpath("//button[@class='slds-button' and text()='View All']")));
		 * js.executeScript("arguments[0].click();",viewAll);
		 * 
		 * //click legalentities WebElement legalEntities =
		 * wait.until(ExpectedConditions.presenceOfElementLocated(By.
		 * xpath("//p[@class='slds-truncate' and text()='Legal Entities']")));
		 * js.executeScript("arguments[0].scrollIntoView(true);",legalEntities);
		 * wait.until(ExpectedConditions.elementToBeClickable(legalEntities)); try { //
		 * Try normal click legalEntities.click(); } catch
		 * (ElementClickInterceptedException e) { // Fallback to JavaScript click
		 * js.executeScript("arguments[0].click();", legalEntities); }
		 * 
		 * driver.findElement(By.xpath("//a[@class='forceActionLink']/div")).click();
		 */
	

	driver.findElement(By.xpath("(//div[contains(@class,'slds-form-element__control slds-grow')])[2]")).sendKeys(name);
	
	driver.findElement(By.xpath("//button[text()='Save']")).click();
	
	String title = driver.findElement(By.xpath("//div[@class='slds-hyphenate']")).getText();
	
	String expectedTitle="Legal Entity \"" + name + "\" was created.";
	
	if(title.equals(expectedTitle)) {
		System.out.println("Leagal entity created successfully");
	  }
	else {
		System.out.println("Leagal entity not created");
	}
	}

}
