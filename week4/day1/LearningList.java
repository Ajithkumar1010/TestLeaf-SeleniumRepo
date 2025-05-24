package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;


public class LearningList {

	public static void main(String[] args) {

		
		WebDriver driver =new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobile Phones" + Keys.ENTER);
		//driver.findElement(By.id("nav-search-submit-button")).click();
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		List<WebElement> webList= driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		 List<Integer> priceList = new ArrayList<>();
		
		for(WebElement elements : webList) {
			
			 String s = elements.getText().replaceAll("[^0-9]", ""); // remove commas or non-digit chars
	            if (!s.isEmpty()) {
	                priceList.add(Integer.parseInt(s));
	            }
	        }

	        if (!priceList.isEmpty()) {
	            Collections.sort(priceList);
	            System.out.println("Sorted Prices: " + priceList);
	            System.out.println("Lowest Price: " + priceList.get(0));
	        } else {
	            System.out.println("No prices found.");
	        }
	        driver.quit();
	     }
		
	     }
	       


	
