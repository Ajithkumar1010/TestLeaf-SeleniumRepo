package week4.day2;

import java.time.Duration;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HomeAssignment {

	public static void main(String[] args) throws InterruptedException {
			
		WebDriver driver = new EdgeDriver ();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
	   //entering username
       driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		
		//entering password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		
		//clicking submit
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		
		//clicking crmsfa
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		
		
		driver.findElement(By.xpath("//input[@id='partyIdFrom']/following-sibling::a")).click();
		
		Set<String> windows1= driver.getWindowHandles();
		
		String parentWindow=driver.getWindowHandle();
		
		for(String handle:windows1) {
			if(!handle.equals(parentWindow)) {
				driver.switchTo().window(handle);
				break;
			}
		}
		
		driver.findElement(By.xpath("//a[@class='linktext'][1]")).click();
		driver.switchTo().window(parentWindow);
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='partyIdTo']/following-sibling::a")).click();
		
		Set<String> windows2 = driver.getWindowHandles();
		
		for(String handle:windows2) {
			if(!handle.equals(parentWindow)) {
				driver.switchTo().window(handle);
				break;
			}
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@class='linktext'])[6]")).click();
		driver.switchTo().window(parentWindow);
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		Thread.sleep(3000);
		String title=driver.getTitle();
		
		if(title.equals("")) {
			System.out.println("Merged successfully");
		}
		else {
			System.out.println("not Merged");
		}
		
	}

}
