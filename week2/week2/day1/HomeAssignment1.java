package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class HomeAssignment1 {

	public static void main(String[] args) {
		
		EdgeOptions options=new EdgeOptions();
		options.addArguments("guest");
		
		WebDriver driver =new EdgeDriver();
		driver.get(" http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("test leaf");
		driver.findElement(By.className("inputBox")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.id("numberEmployees")).sendKeys("4");
		driver.findElement(By.id("officeSiteName")).sendKeys("“LeafTaps");
		driver.findElement(By.className("smallSubmit")).click();
		
		String titlePage= "Account Details | opentaps CRM";
		String title= driver.getTitle();
		
		if(titlePage.equals(title)) {
			System.out.println(titlePage);
		}
		else {
			System.out.println(" title is matched");
		}
		
		driver.close();

	}

}
