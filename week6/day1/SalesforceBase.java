package week6.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class SalesforceBase {
	
	RemoteWebDriver driver;

	@Parameters({"url","email","password"})
	@BeforeMethod
	public void preconditions(String url, String mailId, String password) {
	
	EdgeOptions options = new EdgeOptions();
	options.addArguments("--guest");
	driver=new EdgeDriver(options);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait wait =  new WebDriverWait(driver,Duration.ofSeconds(10));
	JavascriptExecutor js= (JavascriptExecutor) driver;
	
	//Launching url
	driver.get(url);
	
	//entering username
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys(mailId);
	
	//entering password
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
	
	//click login
	driver.findElement(By.xpath("//input[@id='Login']")).click();
	
	//click toggle
	WebElement toggle= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='slds-icon-waffle']")));
	js.executeScript("arguments[0].click();", toggle);
	
	//click viewall
	WebElement viewAll = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='slds-button' and text()='View All']")));
	js.executeScript("arguments[0].click();",viewAll);
	
	//click legalentities
	WebElement legalEntities = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[@class='slds-truncate' and text()='Legal Entities']")));
	js.executeScript("arguments[0].scrollIntoView(true);",legalEntities);
	wait.until(ExpectedConditions.elementToBeClickable(legalEntities));
	try {
	    // Try normal click
	    legalEntities.click();
	} catch (ElementClickInterceptedException e) {
	    // Fallback to JavaScript click
	    js.executeScript("arguments[0].click();", legalEntities);
	}
	
	driver.findElement(By.xpath("//a[@class='forceActionLink']/div")).click();
	
	}
	
	@AfterMethod
	public void postConditions() {
		
		driver.quit();
	}
}
