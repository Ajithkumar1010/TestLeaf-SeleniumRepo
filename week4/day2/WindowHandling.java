package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowHandling {

	public static void main(String[] args) {

		WebDriver driver =new EdgeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//parent window address
		String Parentwindow = driver.getWindowHandle();
		System.out.println("Parent window address:" +Parentwindow + " Title:" +driver.getTitle() );
		
		//clicking another link to open the new window
		driver.findElement(By.xpath("//li[@id='flight']/a/span")).click();
		/*
		 * now another window opened so we need to store it in a set
		 *
		 */
		//to multiple windows we need to use windowHandles()
		Set<String> childWindow = driver.getWindowHandles();
		
		//converting set to list to use get()
		List<String> windowList = new ArrayList<String>(childWindow);
		for (int i = 0; i < windowList.size(); i++) {
			String window = windowList.get(i);
			//switchTo to used to open the new window
			driver.switchTo().window(window);
			System.out.println(driver.getTitle());
		}
		driver.switchTo().window(Parentwindow);
		driver.close();
	
	}

}
