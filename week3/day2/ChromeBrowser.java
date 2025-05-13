package week3.day2;

public class ChromeBrowser extends Browser {
	
	public void openIncognito() {
		System.out.println("chrome browser opened openIncognito mode");
	
	}
	public void clearCache() {
		System.out.println("chrome browser cleared Cache");
	}
	
public static void main(String[] args) {
		
	ChromeBrowser ob=new ChromeBrowser();
	ob.openURL();
	ob.closeBrowser();
	ob.navigateBack();
	ob.openIncognito();
	ob.clearCache();
		
	}
}
