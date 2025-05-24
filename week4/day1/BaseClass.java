package week4.day1;

//Home Assignment ->Method overriding 

public class BaseClass {
	
	public void findElement(String elementName) {
        System.out.println("Finding the element: " + elementName);
    }

    public void clickElement(String elementName) {
        System.out.println("Clicking on element: " + elementName);
    }

    public void enterText(String elementName, String text) {
        System.out.println("Entering text '" + text + "' into element: " + elementName);
    }

   
    public void performCommonTasks() {
        System.out.println("Performing common tasks:");
        findElement("Username Field");
        enterText("Username Field", "admin");
        findElement("Password Field");
        enterText("Password Field", "password123");
        findElement("Login Button");
        clickElement("Login Button");
    }
    
}
