package week5.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WebTable {

	public static void main(String[] args) {
		
		
	WebDriver driver =new EdgeDriver();
	driver.get("https://erail.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.findElement(By.id("txtStationFrom")).sendKeys("MAS" +Keys.ENTER);
	driver.findElement(By.id("txtStationTo")).sendKeys("CBE" +Keys.ENTER);
	driver.findElement(By.id("chkSelectDateOnly")).click();
	
	
	//static webtable
	
	//xpath for getting the excat data and stroing the data
	List<WebElement> elements = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr/td[2]"));
	System.out.println("Train List:");
	for(WebElement trainList: elements) {
		System.out.println(trainList.getText());
	}
	
	
	
	/*
	 * dynamic webtable
	 * 
	 *
	 *  int rowSize= driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr")).size();
	    System.out.println("Train List:");
	    for(int i=2;i<rowSize;i++) {
		String xpath="//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr[" +i+ "]/td[2]";
		WebElement secondColumn = driver.findElement(By.xpath(xpath));
		System.out.println(secondColumn.getText());
		*
		*
		*/
	}
}

