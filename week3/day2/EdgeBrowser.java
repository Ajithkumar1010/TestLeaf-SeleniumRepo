package week3.day2;

public class EdgeBrowser extends Browser {
	
	public void takeSnap() {
		System.out.println("edge browser taken the snap");
	
	}
	public void clearCookies(){
		System.out.println("edge browser cleared the cookies");
	}

	public static void main(String[] args) {
		
		EdgeBrowser ob1=new EdgeBrowser();
		ob1.openURL();
		ob1.closeBrowser();
		ob1.navigateBack();
		ob1.takeSnap();
		ob1.clearCookies();
	}
	 
}
