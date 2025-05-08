package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.Select;

public class ClassRoomActivity1 {

	public static void main(String[] args) {
		
		EdgeOptions options=new EdgeOptions();
		options.addArguments("guest");
		
		EdgeDriver driver =new EdgeDriver();
		driver.get(" http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		WebElement sourceDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select selectObj1 = new Select(sourceDD);
		selectObj1.selectByIndex(4);
		
		WebElement marketingDD = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select selectObj2 = new Select(marketingDD);
		selectObj2.selectByValue("CATRQ_AUTOMOBILE");
		
		WebElement ownershipDD = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select selectObj3 = new Select(ownershipDD);
		selectObj3.selectByVisibleText("Corporation");
		
		driver.findElement(By.name("submitButton")).click();
		
		String titlePage="Create Lead | opentaps CRM";
		String title= driver.getTitle();
		
		if(titlePage.equals(title)) {
			System.out.println(title);
		}
		
		driver.close();
	}

}
