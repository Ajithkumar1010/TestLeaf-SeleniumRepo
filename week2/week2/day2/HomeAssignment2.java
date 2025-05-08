package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.Select;

public class HomeAssignment2 {

	public static void main(String[] args) {
		
		EdgeOptions options=new EdgeOptions();
		options.addArguments("guest");
		
		WebDriver driver =new EdgeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		//adding implicit wait to wait until the page loads
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		//Click on the Create new account button
		driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
		//Enter the First name
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("aaaaa");
		//Enter the Surname
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("aa");
		//Enter the Mobile number or email address
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9629686907");
	
		
		//Handle all three dropdowns in Date of birth
		//selecting date
		
		WebElement date= driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select obj1=new Select(date);
		obj1.selectByIndex(9);
		
		//selecting month
		
		WebElement month= driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select obj2=new Select(month);
		obj2.selectByIndex(5);
		
		//selecting year
		
		WebElement year= driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select obj3=new Select(year);
		obj3.selectByValue("2001");
		
		
		//Select the radio button in Gender
		
		driver.findElement(By.xpath("//span[@data-name='gender_wrapper']//span[2]//input")).click();
		
		

	}

}
