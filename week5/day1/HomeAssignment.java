package week5.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomeAssignment {

	public static void main(String[] args) throws InterruptedException {
		
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--start-maximized"); // Maximize window

		WebDriver driver = new EdgeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://finance.yahoo.com/"); //opens the url

		WebElement market = driver.findElement(By.xpath("//span[.='Markets']")); //xpath to store the element

		Actions ac = new Actions(driver); 

		Thread.sleep(3000);
		ac.moveToElement(market).perform(); //method to hover the mouse

		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='ybar-navigation']/div/ul/li[3]/div/ul/li[9]/a/div")).click(); //clicking the crypto option

		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(@class,'dismiss icon-button yf-jvia91')]//div")).click(); //closing the ad

		List<WebElement> elements = driver.findElements(By.xpath("//tr//td[2]"));  //storing the table element 
		System.out.println("crypto Names:");
		for (WebElement crytoNames : elements) {
		System.out.println(crytoNames.getText());
		}
	}

}
