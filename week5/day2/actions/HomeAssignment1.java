package week5.day2.actions;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class HomeAssignment1 {
	
	@Test
	public void amazon() throws InterruptedException, IOException {

		EdgeOptions options = new EdgeOptions();
		options.addArguments("--start-maximized"); // Maximize window

		WebDriver driver = new EdgeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.amazon.in/"); // opens the url

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro" + Keys.ENTER);

		WebElement price = driver.findElement(By.xpath("//span[@class='a-price-whole'][1]"));

		String firstPrice = price.getText();
		System.out.println("first Price: " + firstPrice);

		/*
		 * Thread.sleep(500); WebElement rating = driver.findElement(By.
		 * xpath("//i[@class='a-icon a-icon-star-small a-star-small-3']"));
		 * System.out.println("rating: " + rating.getText());
		 */
		
		  Thread.sleep(500);
		  WebElement eleRating=driver.findElement(By.xpath("//i[@class='a-icon a-icon-popover'][1]"));
		  eleRating.click();
		  
//		  Actions ac = new Actions(driver);
//		  
//		 // ac.moveToElement(eleRating).build().perform();
//		  
//		  Thread.sleep(1000); 
		  
		  WebElement getRating =
		  driver.findElement(By.xpath("//h2[@id='acr-popover-title']/span[1]"));
		  
		  String mobileRating = getRating.getText();
		  System.out.println("mobileRating: " + mobileRating);
		 
		 

		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"//div[@class='a-section a-spacing-none puis-padding-right-small s-title-instructions-style'][1]"))
				.click();

		String parentWindow = driver.getWindowHandle();

		Set<String> window1 = driver.getWindowHandles();

		for (String handle : window1) {
			if (!handle.equals(window1)) {
				driver.switchTo().window(handle);
			}
		}

		WebElement mobileScreenShot = driver.findElement(By.xpath("//span[@class='a-list-item']//div//img[1]"));

		File source = mobileScreenShot.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Test Leaf\\Selenium\\src\\main\\java\\week5\\day2\\Screenshots\\img.png");
		FileHandler.copy(source, dest);

		Thread.sleep(1000);
		driver.findElement(By.id("add-to-cart-button")).click();

		Thread.sleep(2000);
		WebElement cart = driver.findElement(By.xpath("//span[@class='a-price-whole'][1]"));

		String cartPrize = cart.getText();
		System.out.println("cartPrize: " + cartPrize);

		if (firstPrice.equals(cartPrize)) {
			System.out.println("prize and cart subtototal are same");
		}

		driver.quit();
	}

}
