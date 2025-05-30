package week5.day2.actions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HomeAssignment3 {
	
	@Test
	public void snapdeal() throws InterruptedException {
		
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--start-maximized"); // Maximize window

		WebDriver driver = new EdgeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		Actions ac=new Actions(driver);
		String Parentwindow = driver.getWindowHandle();
		
		driver.get("https://www.snapdeal.com/"); 
		WebElement menFashin= driver.findElement(By.xpath("//span[@class='catText' and contains(text(), \"Men's Fashion\")]"));
		ac.moveToElement(menFashin).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='linkTest' and contains(text(), 'Sports Shoes')][1]")).click();
		
		Thread.sleep(2000);
		WebElement shoesCount = driver.findElement(By.xpath("//h1[@category='Sports Shoes for Men']/following::span[1]"));
		System.out.println("shoesCount: " +shoesCount.getText());
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Sort by:']")).click();
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//ul[@class='sort-value']/li[2]")).click();
		
		/*
		 * List<WebElement> dispalyedPrices
		 * =driver.findElements(By.xpath("//span[@class='lfloat product-price']")).get(i
		 * ); List<Integer> prices= new ArrayList<Integer>(); for(WebElement
		 * element:dispalyedPrices) { String priceText
		 * =element.getText().replaceAll("[^0-9]", ""); if(!priceText.isEmpty()) {
		 * prices.add(Integer.parseInt(priceText)); } }
		 */
		List<WebElement> priceElements = driver.findElements(By.xpath("//span[@class='lfloat product-price']"));
		List<Integer> prices = new ArrayList<>();
		for (int i = 0; i < priceElements.size(); i++) {
		    try {
		        // Re-locate each element during iteration to avoid stale reference
		        WebElement priceElement = driver.findElements(By.xpath("//span[@class='lfloat product-price']")).get(i);
		        String priceText = priceElement.getText().replaceAll("[^0-9]", "");
		        if (!priceText.isEmpty()) {
		            prices.add(Integer.parseInt(priceText));
		        }
		    } catch (StaleElementReferenceException e) {
		        System.out.println("Stale element at index " + i + ", skipping...");
		    }
		}
		
		List<Integer> sortedPrices = new ArrayList<>(prices);
		Collections.sort(sortedPrices);
		
		if (prices.equals(sortedPrices)) {
		    System.out.println("Prices are sorted in ascending order.");
		} else {
		    System.out.println("Prices are NOT sorted correctly.");
		    System.out.println("Actual: " + prices);
		    System.out.println("Expected: " + sortedPrices);
		}
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@for='Color_s-White & Blue']")).click();
		Thread.sleep(3000);
		
		WebElement element = driver.findElement(By.xpath("//div[contains(@class,'favDp product-tuple-listing js-tuple')]"));
		ac.moveToElement(element).build().perform();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='clearfix row-disc']/div)[1]")).click();
		
		Thread.sleep(3000);
         Set<String> childWindow = driver.getWindowHandles();
		
		//converting set to list to use get()
		List<String> windowList = new ArrayList<String>(childWindow);
		for (int i = 0; i < windowList.size(); i++) {
			String window = windowList.get(i);
			//switchTo to used to open the new window
			driver.switchTo().window(window);
		}
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("(//div[contains(@class,'product-price pdp')]/span)[1]")).getText());
		System.out.println(driver.findElement(By.xpath("(//div[contains(@class,'product-price pdp')]/span)[2]")).getText());
		
		driver.close();
			
	}

}
