package week6.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SalesforceCompName extends SalesforceBase {
	
	@Test
	public void companyName() {
		
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
		 * 
		 * driver.findElement(By.xpath("//a[@class='forceActionLink']/div")).click();
		 */
		String companyName="TestLeaf";
		String description="Salesforces";
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		JavascriptExecutor js= (JavascriptExecutor) driver;
		
		//company name
		driver.findElement(By.xpath("(//div[@class='slds-form-element__control slds-grow']/input)[2]")).sendKeys(companyName);
		
		//description
		driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]")).sendKeys(description);
		
		//clicking dropdown
		
		WebElement dropDown=driver.findElement(By.xpath("//div[@class='slds-combobox_container']"));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='slds-combobox_container']")));
		
		js.executeScript("arguments[0].scrollIntoView(true);",dropDown);
				
				wait.until(ExpectedConditions.elementToBeClickable(dropDown));
				try {
				    // Try normal click\r\n"
					dropDown.click();
					} catch (ElementClickInterceptedException e) {
					    // Fallback to JavaScript click\r\n"
				    js.executeScript("arguments[0].click();", dropDown);
				}
				
				
		WebElement active= driver.findElement(By.xpath("//span[@title='Active']"));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@title='Active']")));
		js.executeScript("arguments[0].click;", active);
		
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		
		driver.findElement(By.xpath("//a[text()='Legal Entity Name']")).click();
		
		driver.findElement(By.xpath("(//div[contains(@class,'slds-form-element__control slds-grow')])[2]")).sendKeys(SalesforceName.name);
		
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		
		String title = driver.findElement(By.xpath("//div[@class='slds-hyphenate']")).getText();
		
		String expectedTitle="Legal Entity \"" +SalesforceName.name + "\" was created.";
		
		if(title.equals(expectedTitle)) {
			System.out.println("Leagal entity created successfully");
		  }
		else {
			System.out.println("Leagal entity not created");
		}

	}

}
