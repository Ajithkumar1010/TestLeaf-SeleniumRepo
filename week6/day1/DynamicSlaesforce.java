package week6.day1;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DynamicSlaesforce extends SalesforceBase {
	

	@Test(dataProvider="getData")
	public void dynamic(String name) {
	
   driver.findElement(By.xpath("(//div[contains(@class,'slds-form-element__control slds-grow')])[2]")).sendKeys(name);
	
	driver.findElement(By.xpath("//button[text()='Save']")).click();
	
	String title = driver.findElement(By.xpath("//div[@class='slds-hyphenate']")).getText();
	
	String expectedTitle="Legal Entity \"" + name + "\" was created.";
	
	if(title.equals(expectedTitle)) {
		System.out.println(expectedTitle);
	  }
	else {
		System.out.println("Leagal entity not created");
	}
	}
	
	@DataProvider(name="getData")
	public String [][] sendData(){
		
		return new String[][] {
            {"Ajith"},
            {"Arun"}
	};
}
}
