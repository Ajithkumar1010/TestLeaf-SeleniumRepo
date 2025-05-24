package week4.day1;

//Home Assignment ->Method overriding 

public class LoginClass extends BaseClass {
	
	public void performCommonTasks() {
		 System.out.println("Performing common tasks:");
	        findElement("Username Field");
	        enterText("Username Field", "admin");
	        findElement("Password Field");
	        enterText("Password Field", "password123");
	        findElement("Login Button");
	        clickElement("Login Button");
	}

	public static void main(String[] args) {
		
		LoginClass ob=new LoginClass();
		ob.performCommonTasks();
	}

}
