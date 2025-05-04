package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.close();
		 
		
	/*	ChromeDriver driver=new ChromeDriver();
		//EdgeDriver driver1=new EdgeDriver();
		//load the url
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		//title of the page
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.close();
		*/
	}

}
