package week4.day1;

import java.time.Duration;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


public class AjioList {

	public static void main(String[] args) throws InterruptedException {
		
//		EdgeOptions options = new EdgeOptions ();
//		options.addArguments("--private");
		
		WebDriver driver = new EdgeDriver ();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		//entering the text in search bar
		driver.findElement(By.xpath("//div[@class='searchbar-view']//input")).sendKeys("bags" +Keys.ENTER);
		Thread.sleep(4000);
		
		//Clicking male check box
		driver.findElement(By.xpath("//input[@id='Men']/following-sibling::label")).click();
		Thread.sleep(4000);
		
		//Clicking fashion bags check box
		driver.findElement(By.xpath("//input[@id='Men - Fashion Bags']/following-sibling::label")).click();
		Thread.sleep(4000);
		
		//getting the total items count
		WebElement text=driver.findElement(By.xpath("(//div[@class='filter']/div)[1]"));
		System.out.println("ItemsFound " +text.getText());
		
		//printing list of List of brands
		List<WebElement> brands = driver.findElements(By.xpath("//div[@class='brand']"));
		System.out.println("List of brands:");
		for(WebElement brandList : brands) {
			System.out.println(brandList.getText());
		}
		
		//printing List of bag names
		List<WebElement> names = driver.findElements(By.xpath("//div[@class='nameCls']"));
		System.out.println("List of bag names:");
		for(WebElement bagsNames : names) {
			System.out.println(bagsNames.getText());
		}
	}
}
