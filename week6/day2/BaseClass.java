package week6.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	
	  public RemoteWebDriver driver;
	  
		/*
		 * @BeforeSuite public void startReports() {
		 * System.out.println("reports started"); }
		 * 
		 * @BeforeClass public void testCaseDetails() {
		 * System.out.println("testcase details are assigned"); }
		 * 
		 * @BeforeTest public void setValues() {
		 * System.out.println("values are assigned"); }
		 */
	  @Parameters({"browser","url","username","password"})
	@BeforeMethod
	public void preConditions(String browser,String url,String uName,String pwd) {
		  if (browser.equalsIgnoreCase("chrome")) {
			ChromeOptions opt=new ChromeOptions();
			opt.addArguments("guest");
			driver=new ChromeDriver(opt);
		} else if(browser.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		}
		 
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(uName);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	@AfterMethod
	public void postConditions() {
		driver.close();
	}
	/*
	 * @AfterSuite public void stopReports() {
	 * System.out.println("reports are stopped"); }
	 */

}
