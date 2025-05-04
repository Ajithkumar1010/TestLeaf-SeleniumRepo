package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class HomeAssignment1 {

	public static void main(String[] args) {


		EdgeOptions options=new EdgeOptions();
		options.addArguments("guest");
		
		WebDriver driver =new EdgeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		
		// Selecting the  'the most favourite browser'
		
		driver.findElement(By.className("ui-radiobutton-box ui-widget ui-corner-all ui-state-default")).click();
		
		

	}

}
