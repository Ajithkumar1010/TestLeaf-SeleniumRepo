package week5.day2.actions;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class HomeAssignment2 {
	
	@Test
	public void bigbasket() throws InterruptedException, IOException {
		

		EdgeOptions options = new EdgeOptions();
		options.addArguments("--start-maximized"); // Maximize window

		WebDriver driver = new EdgeDriver(options);
		driver.get("https://www.bigbasket.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Actions ac=new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//(//button[contains(@id,'headlessui-menu-button')])[3]  (//span[text()='Category'])[2]
		
		WebElement shopbyCategory = driver.findElement(By.xpath("(//button[@id='headlessui-menu-button-:R5bab6:'])[1]"));
		js.executeScript("arguments[0].click();",shopbyCategory);
		
		Thread.sleep(2000);
		WebElement foodgrains = driver.findElement(By.xpath("(//a[text()='Foodgrains, Oil & Masala'])[2]"));
		ac.moveToElement(foodgrains).perform();
		Thread.sleep(2000);
		
		WebElement rice = driver.findElement(By.xpath("//a[text()='Rice & Rice Products']"));
		ac.moveToElement(rice).perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Boiled & Steam Rice']")).click();
		

		WebElement checkbox = wait.until(ExpectedConditions.presenceOfElementLocated(
			    By.xpath("//label[text()='BB Royal']/preceding::input[@id='i-BBRoyal']")
			));

			// Scroll the checkbox into view using JavaScript
		    js.executeScript("arguments[0].scrollIntoView(true);", checkbox);

			// Optionally wait for it to be clickable
			wait.until(ExpectedConditions.elementToBeClickable(checkbox));

			// Click the checkbox
			checkbox.click();
			
			// Wait for the element to be visible
			WebElement riceItem = wait.until(ExpectedConditions.visibilityOfElementLocated(
			    By.xpath("//h3[text()='Tamil Ponni Boiled Rice']")
			));

			// Scroll it into view
			js.executeScript("arguments[0].scrollIntoView(true);", riceItem);

			// Optionally wait for clickability
			wait.until(ExpectedConditions.elementToBeClickable(riceItem));
			try {
			    // Try normal click
			    riceItem.click();
			} catch (ElementClickInterceptedException e) {
			    // Fallback to JavaScript click
			    js.executeScript("arguments[0].click();", riceItem);
			}
				
			String parentWindow=driver.getWindowHandle();
			
			Set<String> childWindow = driver.getWindowHandles();
			
			for(String handle: childWindow ) {
				if(!handle.equals(parentWindow)) {
					driver.switchTo().window(handle);
				}
			}
			Thread.sleep(2000);  
			driver.findElement(By.xpath("//div[@class='w-full']/child::div[1]")).click();
			Thread.sleep(2000);
			WebElement price = driver.findElement(By.xpath("(//span[contains(@class,'Label-sc-15v1nk5-0 PackSizeSelector___StyledLabel5-sc-l9rhbt-5 gJxZPQ bvikaK')])"));
			System.out.println(price.getText());
			//Thread.sleep(2000);
			
			WebElement cart = driver.findElement(By.xpath("(//button[text()='Add to basket'])[2]"));
			js.executeScript("arguments[0].scrollIntoView({block: 'center'});", cart);

			wait.until(ExpectedConditions.elementToBeClickable(cart));

			try {
			    
			    cart.click();
			} catch (ElementClickInterceptedException e) {
			    
			    js.executeScript("arguments[0].click();", cart);
			}
			
			
			//WebElement verifymsg =driver.findElement(By.xpath("//p[text()='An item has been added to your basket successfully']"));
			
			WebElement verifyMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(
				    By.xpath("//p[text()='An item has been added to your basket successfully']")
				));

				
				String actualMessage = verifyMsg.getText();
				String expectedMessage = "An item has been added to your basket successfully";

				if (actualMessage.equals(expectedMessage)) {
				    System.out.println("Success message verified");
				} else {
				    System.out.println("Expected: " + expectedMessage);
				    System.out.println("Actual: " + actualMessage);
				}
				
				TakesScreenshot ts=(TakesScreenshot)driver;
				File src = ts.getScreenshotAs(OutputType.FILE);
				File targetFile = new File("C:\\Test Leaf\\Selenium\\src\\main\\java\\week5\\day2\\Screenshots\\rice\\img.png");
				
				FileUtils.copyFile(src, targetFile);
				
				
				driver.quit();
	}
}


