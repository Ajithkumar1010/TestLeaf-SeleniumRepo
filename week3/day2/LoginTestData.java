package week3.day2;

public class LoginTestData extends TestData {
	
	void enterUsername() {
		System.out.println("enter your username");
	}
	
	void enterPassword() {
		System.out.println("enter your password");
		
	}

	public static void main(String[] args) {
		
		LoginTestData obj = new LoginTestData();
		obj.enterCredentials();
		obj.enterUsername();
		obj.enterPassword();
		obj.navigateToHomePage();
		
	}

}
