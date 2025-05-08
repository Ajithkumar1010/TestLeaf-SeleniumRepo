package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class HomeAssignment2 {

	public static void main(String[] args) {
		
		EdgeOptions options=new EdgeOptions();
		options.addArguments("guest");
		
		WebDriver driver =new EdgeDriver();
		driver.get(" http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		
		//entering the username
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		//entring the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//clicking login button
		driver.findElement(By.className("decorativeSubmit")).click();
		//clicking CRM/SFA
		driver.findElement(By.partialLinkText("CRM")).click();
		//Clicking on the "Leads" tab
		driver.findElement(By.linkText("Leads")).click();
		//Clicking on the "Create Lead" button
		driver.findElement(By.linkText("Create Lead")).click();
		//Entering a companyname
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");
		//Entering a FirstName
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ajith Kumar ");
		//Entering a LastName. 
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("P R");
		//Entering a Title
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Lead");
		//Clicking the "Create Lead" button.
		driver.findElement(By.className("smallSubmit")).click();
		
		
		//comparing the title
		String titlePage= "View Lead | opentaps CRM";
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

