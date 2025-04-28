package week1.day2;

 class ChromeBrowser {
	
	 String launchBrowser(String browserName) {
		System.out.println("Browser launched successfully");
		return browserName;	
	}
	 void loadUrl() {
		System.out.println("Application url loaded successfully");
	}
 }
class EdgeBrowser extends ChromeBrowser{
	
	}
		
	public class Browser{

	public static void main(String[] args) {
		
		ChromeBrowser obj=new ChromeBrowser();
		String browName=obj.launchBrowser("Chrome");
		System.out.println(browName);
		obj.loadUrl();
		
		EdgeBrowser obj2=new EdgeBrowser();
		String browName2= obj2.launchBrowser("Edge");
		System.out.println(browName2);
		obj2.loadUrl();
		
	}
}
	

