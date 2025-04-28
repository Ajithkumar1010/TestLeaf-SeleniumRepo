package week1.day1;

public class EdgeBrowser {

	public static void main(String[] args) {
		
		Browser obj2=new Browser();
		String browName=obj2.launchBrowser("Edge");
		System.out.println(browName);
		obj2.loadUrl();

	}

}
